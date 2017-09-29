package SchoolRecruit2016.WAP.MoveCoins;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] board = new int[n][m];
            int count = 0;
            for (int i = 0; i < n; i++) {
                String str = in.nextLine();
                for (int j = 0; j < m && j < str.length(); j++) {
                    if (str.charAt(j) == '.') {
                        board[i][j] = 0;
                    } else {
                        board[i][j] = 1;
                        count++;
                    }
                }
            }
            int k = in.nextInt();
        }


    }

    private int countStep(int[][] a, int count, int step) {

        return 0;
    }

    public static int[][] arrayCopy(int[][] a) {
        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[i][j];
            }
        }
        return b;
    }
}
