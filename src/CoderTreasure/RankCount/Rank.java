package CoderTreasure.RankCount;

/**
 * Created by apple on 2017/3/26.
 */
import java.util.*;

public class Rank {
    public int[] getRankOfNumber(int[] A, int n) {
        // write code here
        int[] Ranks=new int[n];
        Ranks[0]=0;
        int max=A[0];
        for (int i=1;i<n;i++){
            if (A[i]>=max) {
                Ranks[i]=i;
                max=A[i];
            }
            else {
                int count=0;
                int j=i-1;
                for (;j>=0;j--){

                    if (A[j]<=A[i]) count++;
                    if (A[j]==A[i]||A[j]==A[i]-1) {
                        Ranks[i]=Ranks[j]+count;
                        break;
                    }
                }
                if (j<0)
                    Ranks[i]=count;
            }

        }
        return Ranks;
    }
}