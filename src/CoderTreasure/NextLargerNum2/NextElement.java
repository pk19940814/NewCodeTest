package CoderTreasure.NextLargerNum2;

/**
 * Created by apple on 2017/4/4.
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
                int j=i+1;
                int min=-1;
                for (;j<n;j++){
                    if (A[j]>A[i]) {
                        if (min==-1) min=A[j];
                        else {
                            if (min>A[j]) min=A[j];
                        }


                    }
                }

                  result[i]=min;

            }
        }
        return result;
    }
}