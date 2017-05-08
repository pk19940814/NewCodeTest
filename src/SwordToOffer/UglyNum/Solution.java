package SwordToOffer.UglyNum;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {

    public  int GetUglyNumber_Solution(int index) {

        if (index<7) return index;

        int[] num=new int[index+1];
        for (int i=0;i<7;i++){
            num[i]=i;
        }



        for (int i=7;i<index+1;i++){
            int min=0;
            int temp=0;
            int min2=0,min3=0,min5=0;
            for (int j=0;j<i;j++){
                temp=num[j]*2;
                if (temp>num[i-1]) {
                    min2=temp;
                    break;
                }
            }

            for (int j=0;j<i;j++){
                temp=num[j]*3;
                if (temp>num[i-1]) {
                    min3=temp;
                    break;
                }
            }

            for (int j=0;j<i;j++){
                temp=num[j]*5;
                if (temp>num[i-1]) {
                    min5=temp;
                    break;
                }
            }
            min= min2>min3?min3:min2  ;
            min =min>min5?min5:min;

            num[i]=min;



        }

        return num[index];



}
}
