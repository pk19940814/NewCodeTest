package SwordToOffer.FindBiggest;

/**
 * Created by apple on 2017/3/16.
 */
public class Solution {
    public boolean Find(int target,int[][] array){
        int rl=array.length-1;
        int cl=array[0].length-1;
    if(rl<0||cl<0) return false;
        for(int r=rl,c=0;r>=0&&c<=cl;){
            if (target==array[r][c]) return true;
            if (target>array[r][c]) c++;
            else r--;
        }
        return false;
    }

}
