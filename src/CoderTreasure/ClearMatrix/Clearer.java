package CoderTreasure.ClearMatrix;

/**
 * Created by apple on 2017/3/24.
 */
public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        int[][] mewmat=new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                mewmat[i][j]=-1;

        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++){
            if (mat[i][j]==0){
                for (int k=0;k<n;k++){
                    mewmat[i][k]=0;
                    mewmat[k][j]=0;
                }
            }
            else {
               if (mewmat[i][j]==-1) mewmat[i][j]=mat[i][j];
            }

            }

        return mewmat;
    }
}
