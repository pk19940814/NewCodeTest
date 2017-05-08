package CoderTreasure.AddSubstitution;

/**
 * Created by apple on 2017/3/25.
 */
public class AddSubstitution {
    public int calc(int a, int b, int type) {
        // write code here
        if (type==1) return a*b;
        if (type==0) return a/b;
        if (type==-1) return a-b;
        return 0;
    }
}
