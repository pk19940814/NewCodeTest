package CoderTreasure.FindLargestMatrix;

/**
 * Created by apple on 2017/4/4.
 */
public class SubMatrix {
    public int maxSubMatrix(int[][] mat, int n) {
        // write code here

        for (int len=n;len>0;len--){
            int k=n+1-len;
            for (int i=0;i<k;i++){
                for (int j=0;j<k;j++){
                    //int x=i,y=j;
                    int standard=mat[i][j];
                    int p=0;
                    for (;p<len;p++){
                        if (mat[p+i][j]!=standard||mat[i][p+j]!=standard||mat[p+i][j+len-1]!=standard
                                ||mat[i+len-1][p+j]!=standard) break;
                    }
                    if (p==len) return p;

                }
            }
        }

        return 1;
    }



}

