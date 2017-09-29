package SchoolRecruit2016.NetEase.TwoSort;

import java.util.Scanner;

public class Main {
    private static boolean isLength;
    private static boolean isAlphabetic;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            isLength = true;
            isAlphabetic = true;
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = in.next();
                if (i > 0) {
                    compareString(words[i], words[i - 1]);
                    if (!(isLength || isAlphabetic)) {
                        break;
                    }
                }
            }
            if (isLength && isAlphabetic) {
                System.out.println("both");
            } else if (isLength) {
                System.out.println("lengths");
            } else if (isAlphabetic) {
                System.out.println("lexicographically");
            } else {
                System.out.println("none");
            }
        }
    }

    private static void compareString(String var1, String var2) {
        if (isLength && var1.length() < var2.length()) {
            isLength = false;
        }
        int length = var1.length() > var2.length() ? var2.length() : var1.length();
        if (isAlphabetic) {
            for (int i = 0; i < length; i++) {
                char a1 = var1.charAt(i);
                char a2 = var2.charAt(i);
                if (a1 < a2) {
                    isAlphabetic = false;
                    break;
                }
                if (a1 > a2) {
                    break;
                }
                if (i == length - 1) {
                    if (!isLength) {
                        isAlphabetic = false;
                    }
                }
            }
        }
    }

}
