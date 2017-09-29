package SchoolRecruit2016.DiDi.KMax;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Map<Integer, Integer> map = new TreeMap<>();
            String nums = in.nextLine();
            int k = in.nextInt();
            String temp = nums.substring(0);
            int size=1;
            while (temp.indexOf(' ') != -1) {
                String num = temp.substring(0, temp.indexOf(' '));

                if (map.containsKey(Integer.valueOf(num))) {
                    int count = map.get(Integer.valueOf(num));
                    count++;
                    map.put(Integer.valueOf(num), count);
                } else {
                    map.put(Integer.valueOf(num), 1);
                }
                temp = temp.substring(temp.indexOf(' ') + 1);
                size++;
            }


            if (map.containsKey(Integer.valueOf(temp))) {
                int count = map.get(Integer.valueOf(temp));
                count++;
                map.put(Integer.valueOf(temp), count);
            } else {
                map.put(Integer.valueOf(temp), 1);
            }


            int i = 0;

            for (Integer t: map.keySet()) {
                if (i == size - k) {
                    System.out.println(t);
                    break;
                }
                i=i+map.get(t);
            }

        }
    }
}
