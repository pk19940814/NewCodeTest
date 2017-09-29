package SchoolRecruit2016.DiDi.CountZero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int count = 0;
            int p = 5;
            while (n / p > 0) {
                count += n / p;
                p *= 5;
            }
            System.out.println(count);
        }
    }
}
