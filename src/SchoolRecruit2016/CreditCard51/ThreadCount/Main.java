package SchoolRecruit2016.CreditCard51.ThreadCount;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        String path = in.next();
        File file = new File(path);
        FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
        FileLock lock = fileChannel.lock(0, file.length(), false);
        MappedByteBuffer mbBuf = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
        String str = Charset.forName("UTF-8").decode(mbBuf).toString() + "\r\n";



        long start = System.currentTimeMillis();
        DealFileText dft = new DealFileText(file, 3, 1024 * 1024 * 10); // 文件，线程数，文件分割大小
        dft.doFile();
        long end = System.currentTimeMillis();
        //System.out.println("处理文件花费：" + (end - start) / 1000.0 + "秒");
    }
}

class CountWordsThread implements Runnable {
    private FileChannel fileChannel = null;
    private FileLock lock = null;
    private MappedByteBuffer mbBuf = null;
    private Map<String, Integer> hashMap = null;

    public CountWordsThread(File file, long start, long size) {
        try {
            // 得到当前文件的通道
            fileChannel = new RandomAccessFile(file, "rw").getChannel();
            // 锁定当前文件的部分
            lock = fileChannel.lock(start, size, false);
            // 对当前文件片段建立内存映射，如果文件过大需要切割成多个片段
            mbBuf = fileChannel.map(FileChannel.MapMode.READ_ONLY, start, size);
            // 创建HashMap实例存放处理结果
            hashMap = new HashMap<>();
        } catch (Exception e) {

        }
    }

    @Override
    public void run() {
        String str = Charset.forName("UTF-8").decode(mbBuf).toString();
        Stream<String> stream = Stream.of(str.toLowerCase());
        //分割单词并将结果存储在hashmap中
        hashMap = stream.flatMap(s -> Stream.of(s.split("[^a-zA-Z']+")))
                .filter(word -> word.length() > 0)//保留长度不为 0 的单词
                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        try {
            // 释放文件锁
            lock.release();
            // 关闭文件通道
            fileChannel.close();
        } catch (Exception e) {

        }


    }

    public Map<String, Integer> getResultMap() {
        return hashMap;
    }
}

class DealFileText {
    // 要处理的文件
    private File file = null;

    // 线程数
    private int threadNum;

    // 线程表
    private Vector<CountWordsThread> listCountWordsThreads = null;

    // 文件分割大小
    private long splitSize;

    // 当前处理的文件位置
    private long currentPos;

    public DealFileText(File file, int threadNum, long splitSize) {
        //确定线程数最小是1个
        if (threadNum < 1)
            threadNum = 1;
        //确定线程数最大是10个，防止内存不够用
        if (threadNum > 10)
            threadNum = 10;
        //分割最小为1M大小文件
        if (splitSize < 1024 * 1024)
            splitSize = 1024 * 1024;
        //分割最大为10M大小文件
        if (splitSize > 1024 * 1024 * 10)
            splitSize = 1024 * 1024 * 10;

        this.file = file;
        this.threadNum = threadNum;
        this.splitSize = splitSize;
        this.currentPos = 0;
        this.listCountWordsThreads = new Vector<CountWordsThread>();
    }

    public void doFile() throws IOException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(threadNum);//创建一个可重用固定线程数的线程池

        while (currentPos < this.file.length()) {
            CountWordsThread countWordsThread = null;

            if (currentPos + splitSize < file.length()) {
                RandomAccessFile raf = new RandomAccessFile(file, "r");
                raf.seek(currentPos + splitSize);

                int offset = 0;

                while (true) {
                    char ch = (char) raf.read();

                    //是否到文件末尾，到了跳出
                    if (-1 == ch)
                        break;
                    //是否是字母和'，都不是跳出（防止单词被截断）
                    if (false == Character.isLetter(ch) && '\'' != ch)
                        break;

                    offset++;
                }

                countWordsThread = new CountWordsThread(file, currentPos, splitSize + offset);
                currentPos += splitSize + offset;

                raf.close();
            } else {
                countWordsThread = new CountWordsThread(file, currentPos, file.length() - currentPos);
                currentPos = file.length();
            }

            Thread thread = new Thread(countWordsThread);
            pool.execute(thread);//将线程放入池中进行执行
            listCountWordsThreads.add(countWordsThread);
        }

        pool.shutdown(); //关闭线程池

        //等待关闭线程池，每次等待的超时时间为1秒
        while (!pool.isTerminated())
            pool.awaitTermination(1, TimeUnit.SECONDS);

        // 开始总统计数目，并使用TreeMap保证输出结果有序（按首字母排序）
        TreeMap<String, Integer> tMap = new TreeMap<String, Integer>();

        for (int loop = 0; loop < listCountWordsThreads.size(); loop++) {
            Map<String, Integer> hMap = listCountWordsThreads.get(loop).getResultMap();

            Set<String> keys = hMap.keySet();
            Iterator<String> iterator = keys.iterator();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();

                if (key.equals(""))
                    continue;
                if (tMap.get(key) == null) {
                    tMap.put(key, hMap.get(key));
                } else {
                    tMap.put(key, tMap.get(key) + hMap.get(key));
                }
            }
        }

        Set<String> keys = tMap.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            System.out.println("单词:" + key + " 出现次数:" + tMap.get(key));
        }
    }
}