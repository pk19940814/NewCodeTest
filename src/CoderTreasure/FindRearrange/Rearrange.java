package CoderTreasure.FindRearrange;

/**
 * Created by apple on 2017/3/27.
 */
public class Rearrange {
    public int[] findSegment(int[] A, int n) {
        // write code here
        int[] a=new int[2];
        if (n==0) return a;
        int max=A[0],min=A[n-1];
        int pos=0;
       for (int i=1;i<n;i++ ){
           if (A[i]<max){
               pos=i;
           }
           if (A[i]>max) max=A[i];
       }
       a[1]=pos;
        pos=0;
        for (int i=n-2;i>=0;i--){
            if (A[i]<min) min=A[i];
            if (A[i]>min) pos=i;
        }
        a[0]=pos;
        return a;

    }
}
