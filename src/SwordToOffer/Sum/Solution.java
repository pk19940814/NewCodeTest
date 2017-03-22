package SwordToOffer.Sum;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {
    public int Sum_Solution(int n) {
        int sum;
        boolean t=(sum=n)<2||(sum=n+Sum_Solution(n-1))>0;
        return sum;
    }
}
