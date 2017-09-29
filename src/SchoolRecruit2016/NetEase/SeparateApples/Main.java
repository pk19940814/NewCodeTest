package SchoolRecruit2016.NetEase.SeparateApples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n =in.nextInt();
            int apples[] =new int[n];
            int sum=0;
            boolean flag=true;
            for (int i=0;i<n;i++){
                apples[i]=in.nextInt();
                sum+=apples[i];
                if (apples[i]%2==0&&flag){

                }

            }
            if (sum%n!=0){
                System.out.println(-1);
                continue;
            }

        }
    }
}
