package SwordToOffer.Rectangle;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public int RectCover(int target) {//n-2到n 有R(n-2)*2,n-1到n有R(n-1)*1，但是R(n-1)包含了一种R(n-2)
        if(target==0) return 0;
        if (target==1) return 1;
        if (target==2) return 2;
        return RectCover(target-1)+RectCover(target-2);

    }
}
