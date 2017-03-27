package CoderTreasure.MagicIndexVersion;

/**
 * Created by apple on 2017/3/26.
 */
public class MagicIndex {//这一题，开始用递归，没想到栈溢出，后来想想，可以这样，先从A[0]开始，如果A[0]==0那么true;不然从A[A[0]]开始，考虑一些特殊情况
    public boolean findMagicIndex(int[] A, int n) {
      if (A.length<n||A.length<1||n<1) return false;
      int pos=0;
      while (pos<n){
          if (A[pos]==pos)return true;
         if (A[pos]>pos) pos=A[pos];
         else pos++;
      }
      return false;
    }

}