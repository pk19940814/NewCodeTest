package SwordToOffer.FindNumbersTwice;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for (int i=0;i<length;i++){
            int count=0;
            for (int j=i;j<length;j++){
                if (numbers[j]==numbers[i]) count++;
            }
            if (count>1)
            {
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }
}
