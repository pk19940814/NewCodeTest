package SwordToOffer.HalfTimesNum;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int[] times=new int[array.length];
        int [] nums=new int[array.length];
        for (int i=0;i<array.length;i++){
            int j=0;
            for (;nums[j]!=0;j++){
                if (nums[j]==array[i]) break;
            }
            if (nums[j]==0) {
                nums[j]=array[i];
            }
            times[j]++;
            if (times[j]>array.length/2) return nums[j];
        }
        return 0;
    }
}
