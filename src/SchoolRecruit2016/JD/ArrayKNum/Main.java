package SchoolRecruit2016.JD.ArrayKNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            Long n=in.nextLong();
            double k =-0.5+Math.sqrt(2*n+0.25);
            if ((long)k-k==0  ){
                System.out.println((long)k);
            }
            else System.out.println((long)k+1);
        }
    }
}
