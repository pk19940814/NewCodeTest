package CoderTreasure.RunningAnt;

/**
 * Created by apple on 2017/3/25.
 */
public class Ants {
    public double antsCollision(int n) {
        // write code here
        double p=1;
        while (n!=1){
            n--;
            p/=2;
        }
        return 1-p;
    }
}
