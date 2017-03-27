package CoderTreasure.FindLostNumber;

/**
 * Created by apple on 2017/3/25.
 */
public class Finder {
    public int findMissing(int[][] numbers, int n) {
        // write code here
        int i=0;
        for(;i<numbers.length;i++){
            if (numbers[i][0]%2!=i%2) break;

        }
        return  i;
    }
}
