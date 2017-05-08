package CoderTreasure.FindTwoBinaryOne;

/**
 * Created by apple on 2017/3/25.
 */
import java.util.*;

public class CloseNumber {
    public int[] getCloseNumber(int x) {
        // write code here
        int[] closenums=new int[2];
        int n=x-1;
        while (count1(n)!=count1(x)){
            n--;
        }
        closenums[0]=n;
        n=x+1;
        while (count1(n)!=count1(x)){
            n++;
        }
        closenums[1]=n;


        return closenums;
    }
    public int count1(int x){
        int count=0;
        while (x!=0){
            if (x%2==1) count++;
            x/=2;
        }
        return count;
    }
}