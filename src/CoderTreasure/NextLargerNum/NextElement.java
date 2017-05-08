package CoderTreasure.NextLargerNum;

/**
 * Created by apple on 2017/3/27.
 */

public class NextElement {
    public int[] findNext(int[] A, int n) {
        // write code here
        int[] result=new int[n];
        for (int i=0;i<n;i++) result[i]=-1;
        int max=-1;
        for(int i=n-1;i>=0;i--){

                if (result[i]>max){
                    max=A[i];


                }
                else {
                    for (int j=i+1;j<n;j++){
                        if (A[j]>A[i]) {
                            result[i]=A[j];
                            break;
                        }
                    }
            }
        }
        return result;
    }
}