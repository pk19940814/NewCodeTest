package LeetCode.SingleNumplus;



/**
 * Created by apple on 2017/4/20.
 */
public class Solution {
    public int singleNumber(int[] A) {
       int ones=0;
       int twos=0;
       int threes;
        for (int m:A
             ) {
            twos |= ones &m;
            ones  ^= m;
            threes =ones&twos;
            twos^=threes;
            ones^=threes;
        }
        return ones;
    }
}
