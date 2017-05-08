package CoderTreasure.RobotMovement;

/**
 * Created by apple on 2017/3/25.
 */
public class Robot {
    public int countWays(int x, int y) {
        // write code here
        if (x<1||y<1) return 0;
        if (x==1&&y==1) return 1;
        return countWays(x-1,y)+countWays(x,y-1);
    }
}
