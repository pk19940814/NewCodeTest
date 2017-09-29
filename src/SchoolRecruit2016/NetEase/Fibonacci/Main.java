package SchoolRecruit2016.NetEase.Fibonacci;

import java.util.Scanner;

public class Main {
    private static int a;
    private static int b;
    private static int step;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            a = 0;
            b = 1;
            step = num - a;
            while (num - a > 0) {
                step = num - a;
                countFib();
            }
            step = a - num < step ? a - num : step;
            step = step < 0 ? -step : step;
            System.out.println(step);
        }
    }

    private static void countFib() {
        int c = a;
        a = b;
        b = c + b;
    }
}
