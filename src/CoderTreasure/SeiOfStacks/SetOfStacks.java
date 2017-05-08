package CoderTreasure.SeiOfStacks;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/24.
 */
public class SetOfStacks {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
        if (ope==null) return lists;
        int count=0;
        for (int i=0;i<ope.length;i++){
            if (ope[i][0]==1){
                if (count%size==0){
                    ArrayList<Integer> list= new ArrayList<Integer>();
                    list.add(ope[i][1]);
                    lists.add(list);
                }
                else {
                    lists.get((count-1)/size).add(ope[i][1]);
                }
                count++;
            }
            else {
                lists.get((count-1)/size).remove((count-1)%size);
                count--;
                if (count%size==0) lists.remove(count/size);
            }


        }

        return lists;
    }
}