package SchoolRecruit2016.DiDi.Transform;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] base = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            boolean isMinus = false;
            String result = "";
            if (m < 0) {
                m = -m;
                isMinus = true;
            }

            while (m >= n) {
                int k = m % n;
                m /= n;
                result = base[k] + result;
            }
            result = base[m] + result;
            if (isMinus) {
                result = "-" + result;
            }
            System.out.println(result);
        }
    }
}
