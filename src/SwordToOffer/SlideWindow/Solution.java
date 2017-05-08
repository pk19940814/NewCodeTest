package SwordToOffer.SlideWindow;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/20.
 */
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if (num.length<0||size<1||num.length<size) return list;

        for (int i=0;i<num.length-size+1;i++){
            int number=num[i];
            for (int j=i;j<i+size;j++){
                if (num[j]>number) number=num[j];
            }
            list.add(number);
        }
        return list;
    }


}
