package SwordToOffer.PrintString;

/**
 * Created by apple on 2017/3/19.
 */
import java.util.*;


public class Solution {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<String>();

        if (str.length()==0) return list;
        if (str.length()==1) {
            list.add(str);
            //return list;
        }
        for (int i=0;i<str.length();i++){
            String temp1,temp2;
            temp1=""+str.charAt(i);
            temp2=str.substring(0,i)+str.substring(i+1);
            ArrayList<String> list1=Permutation(temp2);
            for (String temp3:list1
                 ) {
                String temp4=temp1+temp3;
                list.add(temp4);
            }

        }
        Set <String> set=new TreeSet<String>();
        for (String t:list
             ) {
            set.add(t);
        }
        list=new ArrayList<>();

        for (String t:set
             ) {
            list.add(t);
        }

        /**
        for (Iterator iterator=set.iterator();iterator.hasNext();){
            list.add(iterator.next().toString());
        }
         */
       // System.out.println(set.size());
       return list;
    }



}