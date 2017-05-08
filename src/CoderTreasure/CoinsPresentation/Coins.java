package CoderTreasure.CoinsPresentation;

/**
 * Created by apple on 2017/3/26.
 */
public class Coins {
    public int countWays(int n) {
        // write code here
       if (n<1) return 0;
       if (n<5) return 1;
       if (n<10) return 2;
       if (n==10) return 4;
       if (n==25) return 9;

       return countWays(n-1)+countWays(n-5)+countWays(n-10)+countWays(n-25);
    }


}
