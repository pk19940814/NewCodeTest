package CoderTreasure.LinesMeet;

/**
 * Created by apple on 2017/3/25.
 */
public class CrossLine {
    public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        // write code here
        if (s1==s2&&y1!=y2) return false;
        return true;
    }
}
