package SchoolRecruit2016.DiDi.Restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[][] b = new int[m][2];
            for (int i = 0; i < m; i++) {
                int c1=in.nextInt();
                int c2=in.nextInt();

                b[i][0] = in.nextInt();
                b[i][1] = in.nextInt();
            }


        }
    }
}
