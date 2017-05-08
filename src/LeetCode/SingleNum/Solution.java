package LeetCode.SingleNum;

/**
 * Created by apple on 2017/4/20.
 */
public class Solution {
    public int singleNumber(int[] A) {
        int result=0;
        for (int p:A
             ) {
            result^=p;
        }

        return result;
    }
}
