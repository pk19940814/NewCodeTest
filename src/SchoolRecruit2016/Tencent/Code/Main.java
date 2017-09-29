package SchoolRecruit2016.Tencent.Code;

import java.util.Scanner;

public class Main {

    public static final long P1=3+26*26*26;
    public static final long P2=3+26*26*26;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            Character ch1=str.charAt(0);
            Character ch2=str.charAt(1);
            Character ch3=str.charAt(2);
            Character ch4=str.charAt(4);

            long index=0;
            int period1=ch1-'a';
            index+=period1*P1;




        }
    }
}
