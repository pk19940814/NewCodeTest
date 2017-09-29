package SchoolRecruit2016.JD.Multi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long sum = 0;
            Map<String, Long> map = new HashMap<>();
            long n = in.nextLong();
            for (long i = 1; i <= n; i++) {
                for (long j = 1; j <= n; j++) {
                    Long m = (long) Math.pow(i, j);
                    String str = String.valueOf(m);
                    if (map.get(str) == null) {
                        map.put(str, 1L);
                    } else {
                        map.put(str, map.get(str) + 1);
                    }
                }
            }
            for (String str : map.keySet()) {
                Long count = map.get(str);
                sum %= 1000000007;
                sum += count * count;
            }
            System.out.println(sum);

        }
    }
}
