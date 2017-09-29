package SchoolRecruit2016.Meituan.AverageAge;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int w = in.nextInt();
            int y = in.nextInt();
            double x = in.nextDouble();
            int n = in.nextInt();

            double product = w * y;
            for (int i = 0; i < n; i++) {
                product += w;
                product = product * (1 - x);
                product += w * x * 21;
            }
            int result = (int) (product / y);
            if (result < product / y) {
                result++;
            }
            System.out.println(result);
        }
    }

}
