package CoderTreasure.ExchangeBinaryNum;

/**
 * Created by apple on 2017/3/25.
 */
public class Exchange {
    public int exchangeOddEven(int x) {
        // write code here
        int k=0,count=1;
        while (x!=0){
           if (x%4==0||x%4==3){
               k+=count*(x%4);
           }
           else {
               k+=count*(3-x%4);
           }
            x/=4;
           count*=4;
        }
       return k;
    }
}