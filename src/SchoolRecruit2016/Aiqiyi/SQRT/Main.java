package SchoolRecruit2016.Aiqiyi.SQRT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int max = n > m ? n : m;
            int min = n > m ? m : n;
            int pupu = (int) Math.sqrt(max);
            int temp[] = new int[pupu];
            for (int i = 0; i < pupu; i++) {
                temp[i] = (i + 1) * (i + 1);
            }
            System.out.println(count(min, max, temp));
        }
    }


    private static long count(int min, int max, int[] temp) {
        Map<Integer, Integer> maxMap = new HashMap<>();
        for (int i = 1; i <= min; i++) {
            if (maxMap.get(i) != null) continue;
            for (int j = 0; j < temp.length; j++) {

                if (i * temp[j] <= max) {
                    if (maxMap.get(i) == null) {
                        maxMap.put(i, 1);
                    } else {
                        maxMap.put(i, maxMap.get(i) + 1);
                    }
                }
            }

            for (int j = 0; j < temp.length; j++) {
                if (i * temp[j] > min) break;
                maxMap.put(i * temp[j], maxMap.get(i));
            }
        }

        long sum = 0;
        for (Integer integer : maxMap.keySet()) {
            sum += maxMap.get(integer);
        }


        return sum;
    }

}
