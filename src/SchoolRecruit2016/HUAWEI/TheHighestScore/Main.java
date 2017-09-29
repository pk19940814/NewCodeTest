package SchoolRecruit2016.HUAWEI.TheHighestScore;

import java.util.Scanner;

public class Main {
    private static int[] arrays;
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int m = in.nextInt();
             arrays=new int[n];
            for (int i=0;i<n;i++){
                arrays[i]=in.nextInt();
            }
            for (int i=0;i<m;i++){
                char c=in.next().charAt(0);
                if (c=='U'){
                    updateScores(in.nextInt(),in.nextInt());
                }
                if (c=='Q'){
                    System.out.println(findHighest(in.nextInt(),in.nextInt()));
                }
            }
        }
    }

    private static int findHighest(int start,int end){
        if (start >end){
            int temp=start;
            start=end;
            end=temp;
        }
        int highest=arrays[start-1];
        for (int i=start-1;i<end;i++){
            if (arrays[i]>highest){
                highest=arrays[i];
            }
        }
        return highest;
    }

    private static void updateScores(int index,int target){
        arrays[index-1]=target;
    }

}
