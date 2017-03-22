package SwordToOffer.FuckingFrog;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public int JumpFloorII(int target) {//类似于高中数学排列组合的抽板子问题，在大于0时是2^n
        if (target==0) return 0;
        if (target==1) return 1;
        if (target==2) return 2;
        int result=0;
        for(int i=0;i<target;i++){
            result+=JumpFloorII(i);
        }
        return result;
    }
}
