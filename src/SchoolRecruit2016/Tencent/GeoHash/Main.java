package SchoolRecruit2016.Tencent.GeoHash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            String str = "";
            int left = -90;
            int mid = 0;
            int right = 90;
            for (int i = 0; i < 6; i++) {
                if (n > mid) {
                    str += "1";


                } else if (n < mid) {
                    str += "0";
                } else {
                    str += "1";
                    break;
                }
            }


            System.out.println(str);
        }
    }
}
