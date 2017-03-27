package CoderTreasure.BinaryInser;

/**
 * Created by apple on 2017/3/25.
 */
public class BinInsert {
    public int binInsert(int n, int m, int j, int i) {
        // write code here
        while(j!=0){
            m*=2;
            j--;
        }
        return n+m;
    }
}
