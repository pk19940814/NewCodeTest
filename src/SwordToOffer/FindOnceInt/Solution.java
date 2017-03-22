package SwordToOffer.FindOnceInt;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int [] num=new int[2];
        int pos=0;
        for (int i=0;i<array.length;i++){
            int count=0;
            for (int j=0;j<array.length;j++){
               if (array[i]==array[j] ) count++;
            }
            if (count==1) {
                num[pos]=array[i];
                pos++;
            }

        }
        num1[0]=num[0];
        num2[0]=num[1];


    }
}
