package SwordToOffer.JudgeWithoutCompare;

/**
 * Created by apple on 2017/3/26.
 */
public class Max {
    public int getMax(int a, int b) {
        // write code here
        b=a-b;

        a-=b&(b>>31);
        return a;

    }

}