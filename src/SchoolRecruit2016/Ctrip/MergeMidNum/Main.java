package SchoolRecruit2016.Ctrip.MergeMidNum;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LocalDateTime.now();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                list.add(in.nextInt());
            }
            Collections.sort(list);
            if (list.size() % 2 == 1) {

                System.out.println(list.get(list.size() / 2));
            } else {
                double result = (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2.0;
                System.out.println(result);

            }
        }
    }
}
