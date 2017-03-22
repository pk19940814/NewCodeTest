package SwordToOffer.PrintMinNuM;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/20.
 */
public class Solution {
    public String PrintMinNumber(int [] numbers) {

       String str=new String();
       ArrayList<String> list=new ArrayList<>();
        for (int n:numbers
             ) {
            list.add(""+n);
        }

        if (list.size()<=0) return "";
        if (list.size()==1) return list.get(0);
        for (int i=0;i<list.size()-1;i++){
            for (int j=1;j<list.size()-i;j++){

                if (AcomB(list.get(j),list.get(j-1))) {//比较j-1与j，如果j-1大，调换

                    String temp=list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,temp);
                }


            }
        }



        for (String stemp:list
             ) {
            str+=stemp;
        }
        return str;
    }

    public boolean AcomB(String A,String B){//A是否小于B

        String AB=A+B;
        String BA=B+A;
        if (AB.equals(BA)) {
            if(AB.length()<BA.length()) return true;
            else  return false;
        }
        for (int i=0;i<AB.length();i++){


            if (AB.charAt(i)>BA.charAt(i))

                return false;

            if (AB.charAt(i)<BA.charAt(i)) return true;


        }

return true;

    }



}
