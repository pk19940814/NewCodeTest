package CoderTreasure.TransformPic;

/**
 * Created by apple on 2017/3/24.
 */
public class Transform {
    public int[][] transformImage(int[][] mat, int n) {

        int[][] newmat=new int[n][n];
        double mid=(n-1)/2.0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                double x=j-mid;
                double y=mid-i;
                double x1=y;
                double y1=-x;
                int i1=(int)(mid-y1);
                int j1=(int )(x1+mid);

                newmat[i1][j1]=mat[i][j];
            }
        }
        return newmat;
        // write code here
    }
}
