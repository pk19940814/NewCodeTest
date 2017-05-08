package SwordToOffer.FindMinK;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList <Integer> result=new ArrayList<Integer>();
            if (input.length<k) return result;

            for (int i=1;i<input.length;i++){
                if (input[i-1]>input[i]){
                    int temp=input[i];
                    int j=i;
                    for ( j=i;j>0&&input[j-1]>temp;j--){
                        input[j]=input[j-1];
                    }
                    input[j]=temp;
                }
             }





        for (int i=0;i<k;i++){
            result.add(input[i]);
        }
             return result;

        }
}
