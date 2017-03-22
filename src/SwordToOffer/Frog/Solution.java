package SwordToOffer.Frog;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public int JumpFloor(int target){
        if (target==1) return 1;
        if (target==2) return 2;
        if (target==0) return 0;
        return JumpFloor(target-2)+JumpFloor(target-1);//在这里，跳n-1包含了n-2的一种挑房，跳n-1有一种是跳n-2再跳1
    }
}
