package SchoolRecruit2016.NetEase.ResortArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                int n = in.nextInt();

                int non2 = 0;//奇数
                int non4 = 0;//偶数
                int on4 = 0;//4数


                for (int j = 0; j < n; j++) {
                    int num = in.nextInt();
                    if (num % 4 == 0) {
                        on4++;
                    } else if (num % 2 == 0) {
                        non4++;
                    } else {
                        non2++;
                    }
                }


                if (non4 == 0) {
                    if (on4 >= non2 - 1) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    if (on4 >= non2) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }

            }
        }
    }


}
