package CoderTreasure.FindMiddleOnTime;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/27.
 */
import java.util.ArrayList;

public class Middle {
    public int[] getMiddle(int[] A, int n) {
        // write code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        int[]B=new int[n];
        for (int i=0;i<n;i++)
        {
            list.add(findPos(list,A[i]),A[i]);

                B[i]=list.get(i/2);

        }

        return B;


    }

    public int findPos(ArrayList<Integer> list,int n){
        if(list.size()==0) return 0;
        int start=0,end=list.size()-1;
        while (start<=end){
            if (list.get(start)>=n) return start;
            else if (list.get(end)<=n) return end+1;
            int mid=(start+end)/2;
            if (list.get(mid)==n) return mid;
            else if (list.get(mid)<n){
                //if(start==end) return start+1;
                start=mid+1;
                end=end-1;
            }
            else{
                // if(start==end) return start;
                start=start+1;
                end=mid-1;
            }
        }

        if (start>end) return start;
        return list.size();




    }
}