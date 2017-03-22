package SwordToOffer.CountCircle;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {
    public int LastRemaining_Solution(int n, int m) {

        if (n==0) return -1;
        int count=0,sum=n;
        int[] nums=new int[n];
        boolean flag=true;

       // while (flag){

            for (int i=0;i<n;i=(i+1)%n){
                if (sum==1){
                    //flag=false;
                    break;
                }
                if (nums[i]==0){

                    count++;

                    if (count==m) {
                        sum--;
                        nums[i]=1;
                        count=0;
                    }
                }
          //  }

        }






        int pos=0;
        for (int i=0;i<n;i++){
            if (nums[i]==0) {
                pos=i;
                break;
            }
        }
    return pos;

    }
}
