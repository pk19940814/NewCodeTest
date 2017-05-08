package CoderTreasure.RobotNewVersionMovement;

/**
 * Created by apple on 2017/3/26.
 */
public class Robot {
    public int countWays(int[][] map, int x, int y) {
        // write code here
        if(x<1||y<1) return 0;
        if (map[0][0]!=1) return 0;
        int[][] mov=new int[x][y];
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                if (map[i][j]==1) mov[i][j]=0;
                else  mov[i][j]=-1;
            }
        }

        mov[0][0]=1;
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                if (mov[i][j]==-1) continue;
                int count=0;
                if (j-1>=0&&mov[i][j-1]!=-1){
                    count+=mov[i][j-1];
                }
                if (i-1>=0&&mov[i-1][j]!=-1){
                    count+=mov[i-1][j];
                }
                mov[i][j]+=count;
            }
        }
        if (mov[x-1][y-1]==-1) return 0;
        return mov[x-1][y-1];

    }
}
