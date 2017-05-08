package CoderTreasure.SumSix;

/**
 * Created by apple on 2017/3/27.
 */
import java.util.*;

public class FindPair {
    public int countPairs(int[] A, int n, int sum) {
        // write code here
        int[] B=new int[sum+1];
        for (int t:A
                ) {
            if (t<=sum)
                B[t]++;
        }
        int result=0;
        for (int i=0;i<sum/2;i++){
            result+=B[i]*B[sum-i];
        }
        if(sum%2==1) {
            result+=B[sum/2]*B[sum/2+1];

        }else{
            result+=B[sum/2]*(B[sum/2]-1)/2;       }
        return result;
    }
}