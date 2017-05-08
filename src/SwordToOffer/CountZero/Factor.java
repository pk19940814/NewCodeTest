package SwordToOffer.CountZero;

/**
 * Created by apple on 2017/3/26.
 */
public class Factor {
    public int getFactorSuffixZero(int n) {
        // write code here
        int count=0,k=5;
        while(n/k!=0){
            count+=n/k;
            k*=5;
        }
        return count;
    }
}