package CoderTreasure.GoUpstairs;

/**
 * Created by apple on 2017/3/25.
 */
public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        if (n<1) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        if (n==3) return 4;
       int [] numbers=new int[n];
       numbers[0]=1;
       numbers[1]=2;
       numbers[2]=4;
       for (int i=3;i<n;i++){

           numbers[i]=((numbers[i-1]+numbers[i-2])%1000000007+numbers[i-3])%1000000007;
       }
       return numbers[n-1];
    }

}
