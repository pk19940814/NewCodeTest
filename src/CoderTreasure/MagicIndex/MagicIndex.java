package CoderTreasure.MagicIndex;

/**
 * Created by apple on 2017/3/26.
 */
public class MagicIndex {
    public boolean findMagicIndex(int[] A, int n) {
        // write code here
        if (A[0]>0||A[n-1]<n-1) return false;
        int start=0,end=n-1;
        int mid=(start+end)/2;
        while (start<=end){
            if (A[mid]==mid) return true;
            else if (A[mid]<mid){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
            mid =(start+end)/2;
        }
        return false;
    }
}
