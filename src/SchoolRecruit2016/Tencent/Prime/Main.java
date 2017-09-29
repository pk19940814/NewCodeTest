package SchoolRecruit2016.Tencent.Prime;


import java.util.Scanner;

public class Main {
    private static int[] num;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            num = new int[n];
            createArray(n);
            printPrimePair(n);
        }
    }

    private static void createArray(int n) {
        num[0] = 1;
        for (int i = 2; i < n; i++) {
            for (int j = i; j * i <= n; j++) {
                num[j * i - 1] = 1;
            }
        }
    }

    private static void printPrimePair(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int n) {

        if (num[n - 1] == 0) return true;
        return false;
    }
}
