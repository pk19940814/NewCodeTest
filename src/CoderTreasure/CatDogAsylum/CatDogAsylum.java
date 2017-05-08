package CoderTreasure.CatDogAsylum;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/24.
 */
public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> list=new ArrayList<Integer>(),listadopt=new ArrayList<Integer>();
        for (int i=0;i<ope.length;i++){
            if (ope[i][0]==1) list.add(ope[i][1]);
            else {
                if (ope[i][1]==0) {
                    listadopt.add(list.get(0));
                    list.remove(0);
                }
                else if (ope[i][1]==1) {
                    for (int j=0;j<list.size();j++){
                        if (list.get(j)>0) {
                            listadopt.add(list.get(j));
                            list.remove(j);
                            break;
                        }
                    }
                }
                else {
                    for (int j=0;j<list.size();j++){
                        if (list.get(j)<0) {
                            listadopt.add(list.get(j));
                            list.remove(j);
                            break;
                        }
                    }
                }
            }
        }


        return listadopt;

    }
}