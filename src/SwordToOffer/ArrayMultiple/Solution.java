package SwordToOffer.ArrayMultiple;

/**
 * Created by apple on 2017/3/19.
 */
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        if (A.length==0) return null;
        int[] B=new int[A.length];
        for (int i=0;i<A.length;i++){
            int M=1;
            for (int j=0;j<i;j++){
                M*=A[j];
            }
            for (int j=i+1;j<A.length;j++){
                M*=A[j];
            }
            B[i]=M;
        }
        return B;
    }
}
