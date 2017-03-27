package CoderTreasure.TransBinaryNum;

/**
 * Created by apple on 2017/3/25.
 */
public class Transform {
    public int calcCost(int A, int B) {
        // write code here
        int k=A^B;
        int count=0;
        while (k!=0){
            if (k%2==1) count++;
            k/=2;
        }
        return count;
    }
}
