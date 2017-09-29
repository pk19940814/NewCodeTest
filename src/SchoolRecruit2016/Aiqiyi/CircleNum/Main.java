package SchoolRecruit2016.Aiqiyi.CircleNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int x1 = in.nextInt();
            int k1 = in.nextInt();
            int x2 = in.nextInt();
            int k2 = in.nextInt();
            String str1 = "";
            for (int i = 0; i < k1; i++) {
                str1 += String.valueOf(x1);
            }

            String str2 = "";
            for (int i = 0; i < k2; i++) {
                str2 += String.valueOf(x2);
            }
            compareTo(str1, str2);
        }
    }

    private static void compareTo(String st1, String st2) {
        if (st1.equals(st2)) {
            System.out.println("Equal");
        } else if (st1.length() > st2.length()) {
            System.out.println("Greater");
        } else if (st1.length() < st2.length()) {
            System.out.println("Less");
        } else {
            for (int i = 0; i < st1.length(); i++) {
                char c1 = st1.charAt(i);
                char c2 = st2.charAt(i);
                if (c1 > c2) {
                    System.out.println("Greater");
                    break;
                } else if (c1 < c2) {
                    System.out.println("Less");
                } else {
                    if (i == st1.length() - 1) {
                        System.out.println("Equal");
                    }
                }
            }
        }

    }
}
