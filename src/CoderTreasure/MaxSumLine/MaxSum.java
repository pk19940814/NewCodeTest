package CoderTreasure.MaxSumLine;

/**
 * Created by apple on 2017/3/27.
 */
import java.util.*;

public class MaxSum {
    public int getMaxSum(int[] A, int n) {
        // write code here
        int max=-2147483648;
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=i;j<n;j++){
                sum+=A[j];
                if (sum>max) max=sum;
            }
        }
        return max;
    }
}