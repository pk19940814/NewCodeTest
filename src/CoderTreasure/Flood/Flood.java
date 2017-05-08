package CoderTreasure.Flood;

/**
 * Created by apple on 2017/3/26.
 */
public class Flood {
    public int floodFill(int[][] map, int n, int m) {
        // write code here
        int[][] time=new int[n][m];
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
            {
                if (map[i][j]==0) {
                    time[i][j]=2147483647;
                }
                else time[i][j]=-1;
            }
        time[0][0]=0;
        flooding(map,time,0,0,n,m);


        return  time[n-1][m-1];
    }
    public void flooding(int [][] map,int[][] time,int i,int j,int n,int m){
        int k=time[i][j]+1;
        if (i-1>=0&&map[i-1][j]==0) {
            if (time[i-1][j]>k) {
                time[i-1][j]=k;
                flooding(map,time,i-1,j,n,m);

            }

        }

        if (j-1>=0&&map[i][j-1]==0) {
            if (time[i][j-1]>k) {
                time[i][j-1]=k;
                flooding(map,time,i,j-1,n,m);

            }

        }

        if (i+1<n&&map[i+1][j]==0) {
            if (time[i+1][j]>k) {
                time[i+1][j]=k;
                flooding(map,time,i+1,j,n,m);

            }

        }

        if (j+1<m&&map[i][j+1]==0) {
            if (time[i][j+1]>k) {
                time[i][j+1]=k;
                flooding(map,time,i,j+1,n,m);

            }

        }




    }
}
