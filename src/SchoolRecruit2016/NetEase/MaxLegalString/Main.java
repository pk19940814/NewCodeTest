package SchoolRecruit2016.NetEase.MaxLegalString;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            Set<String> set = new HashSet<>();
            int length = str.length();
            set = generateParenthesis(length / 2);
            set.remove(str);
            Map<Integer, Integer> map = new TreeMap<>();
            int max = 0;
            for (String temp : set) {
                int count = maxSubseq(temp, str);
               // System.out.println(count);
                if (map.get(count) == null) {
                    map.put(count, 1);
                } else {
                    map.put(count, map.get(count) + 1);
                }
                max = count > max ? count : max;
            }
            //System.out.println(max);
            System.out.println(map.get(max));

        }
    }

    public static int maxSubseq(String strOne, String strTwo) {
        // 参数检查
        if (strOne == null || strTwo == null) {
            return 0;
        }
        if (strOne.equals("") || strTwo.equals("")) {
            return 0;
        }
        // 矩阵的横向长度
        int len1 = strOne.length();
        // 矩阵的纵向长度
        int len2 = strTwo.length();
        // 二维数组用来保存中间结果
        int[][] datas = new int[len1 + 1][len2 + 1];
        // 使用另外一个二维数组作为标记数组，用来保存从前一步到这一步的路径
        String[][] index = new String[len1 + 1][len2 + 1];
        // 填充二维数组
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                int leftTop = datas[i - 1][j - 1];
                int top = datas[i - 1][j];
                int left = datas[i][j - 1];
                if (strOne.charAt(i - 1) == strTwo.charAt(j - 1)) {
                    leftTop++;
                }
                int maxTemp = Math.max(leftTop, top);
                datas[i][j] = Math.max(maxTemp, left);
                // 填写标记数组
                if (datas[i][j] == leftTop) {
                    index[i][j] = "leftTop";
                } else if (datas[i][j] == left) {
                    index[i][j] = "left";
                } else {
                    index[i][j] = "top";
                }
            }
        }
        StringBuilder sBuilder = new StringBuilder();
        // 从二维矩阵的最后一个元素向前查找结果，当（左上， 左， 上）数字相同时，查找顺序：左上-> 左 -> 上
        int maxLen = datas[len1][len2];
       // System.out.println("LCS长度为:" + maxLen);
        int i = len1;
        int j = len2;
        String indexStr = "";
        char currentCh = ' ';
        int currentLen = 0;
        while (i > 0 && j > 0) {
            currentLen = datas[i][j];
            currentCh = strOne.charAt(i - 1);
            indexStr = index[i][j];
            if (indexStr.equals("leftTop")) {
                i--;
                j--;
            } else if (indexStr.equals("left")) {
                j--;
            } else {
                i--;
            }
            if (currentLen > datas[i][j]) {
                sBuilder.insert(0, currentCh);
            }
        }
        return sBuilder.toString().length();
    }

    private static Set<String> generateParenthesis(int n) {
        Set<String> ans = new HashSet<>();
        if (n == 0) {
            return ans;
        }
        Stack<String> seq = new Stack<>();
        Stack<Integer> valid = new Stack<>();


        seq.push("(");
        valid.push(0);
        while (!seq.empty()) {
            String s = seq.pop();
            int v = valid.pop();
            if (s.length() == 2 * n) {
                ans.add(s);
                continue;
            }

            if (s.length() - v < n) {
                seq.push(s + "(");
                valid.push(v);
            }

            if (v * 2 < s.length()) {
                seq.push(s + ")");
                valid.push(v + 1);
            }
        }
        return ans;
    }

}
