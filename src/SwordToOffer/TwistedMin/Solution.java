package SwordToOffer.TwistedMin;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public int minNumberInRotateArray(int[] array){
        if (array.length==0) return 0;
        for (int i=1;i<array.length;i++){
            if (array[i-1]>array[i])  return array[i];
        }
        return array[0];
    }
}
