package CMBCC.CalNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            int min=getMinCal(a,b);
            int count=0;
            for (int i=1;;i++){
                if (min*i>n){
                    break;
                }
                count++;
            }
            System.out.println(count);
        }
    }

    private static int getMinCal(int a,int b){
        return a*b/getMaxMult(a,b);
    }

    private static int getMaxMult(int a, int b) {
        int m = a % b;
        while (m != 0) {
            a = b;
            b = m;
            m = a % b;
        }
        return b;
    }
}
