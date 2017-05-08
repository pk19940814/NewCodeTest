package SwordToOffer.ArrayOdd;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public void reOrderArray(int [] array) {
        int length=array.length;
        int pos=0;
        int dest=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==1){
                int temp=array[pos];
                array[pos]=array[i];
                pos++;
                for(int j=pos;j<i;j++){
                    int temp1=array[j];
                    array[j]=temp;
                    temp=temp1;
                }
                array[i]=temp;
            }
        }


    }
}
