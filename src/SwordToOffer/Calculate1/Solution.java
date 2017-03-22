package SwordToOffer.Calculate1;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for (int i=0;i<n+1;i++){
            int temp=i;
            while (temp!=0){
                if (temp%10==1) count++;
                temp/=10;
            }
        }
        return count;
    }
}
