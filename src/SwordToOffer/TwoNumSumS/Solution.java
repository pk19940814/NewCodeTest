package SwordToOffer.TwoNumSumS;

/**
 * Created by apple on 2017/3/19.
 */
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int M=sum*sum;
        int min=0,max=0;
        int length=array.length;
        if (length<2) return list;
        for (int i=0,j=length-1;i<j;){
            if (sum==array[i]+array[j]) {

                if (M>=array[i]*array[j]) {
                    M=array[i]*array[j];
                    min=array[i];
                    max=array[j];
                }
                i++;
                j--;
            }
            else if (sum<array[i]+array[j]){
                j--;
            }
            else {
                i++;
            }
        }
        if (min==0||max==0) return list;
        list.add(min);
        list.add(max);
        return list;
    }
}