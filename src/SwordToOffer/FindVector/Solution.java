package SwordToOffer.FindVector;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0) return 0;
        int sum=array[0];
        for (int i=0;i<array.length-1;i++){
            int temp=array[i];
            int sumSub=temp;
            for (int j=i+1;j<array.length;j++){
                sumSub+=array[j];
                if (sumSub>temp) temp=sumSub;
            }
            if (temp>sum) {
                sum=temp;
            }
        }
        return sum;
    }
}
