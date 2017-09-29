package SchoolRecruit2016.Wacai.SumSeries;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            double rate = n;
            double sum = 0;
            for (int i = 0; i < m; i++) {
                sum += rate;
                rate = Math.sqrt(rate);
            }
            int temp = (int) (sum * 100);
            if (sum * 100 - temp >= 0.5) {
                temp++;
            }
            sum = temp / 100.0;
            String s = String.valueOf(sum);
            if (s.indexOf('.') != -1) {
                if (s.length() - s.indexOf('.') != 3) {
                    int p = s.length() - s.indexOf('.');
                    for (; p < 3; p++) {
                        s += "0";
                    }
                }
            }
            System.out.println(s);
        }

    }

}
