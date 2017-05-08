package SwordToOffer.FindIndexS;

/**
 * Created by apple on 2017/3/19.
 */
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
        for (int i=1;i<=sum/2+1;i++){
            ArrayList<Integer> list=new ArrayList<Integer>();
            int subsum=0;
            for (int j=i;j<=sum/2+1;j++){
                subsum+=j;
                if (subsum==sum) {
                    for (int k=i;k<=j;k++)
                        list.add(k);
                    break;
                }
                if (subsum>sum)break;
            }
            if (list.size()>1)
            lists.add(list);
        }

        return lists;
    }
}