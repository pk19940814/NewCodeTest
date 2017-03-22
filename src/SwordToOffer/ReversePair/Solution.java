package SwordToOffer.ReversePair;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {

    public int InversePairs(int [] array) {

    if (array==null||array.length==0) return 0;
    int []  temp=new int[array.length];
    for (int i=0;i<array.length;i++){
        temp[i]=array[i];
    }
    int count=Sort(array,temp,0,array.length-1);
        return count;
    }

    public int Sort(int[] array,int[] temp,int low,int high){
        if (low==high){
            return 0;
        }
        int mid=(low+high)/2;
        int leftcount=Sort(array,temp,low,mid)%NUM;
        int rightcount=Sort(array,temp,mid+1,high)%NUM;
        int count=0;
        int i=mid;
        int j=high;
        int pos=high;
        while (i>=low&&j>mid){
            if (array[i]>array[j]){
                count+=j-mid;

                temp[pos--]=array[i--];
                count%=NUM;
            }
            else {
                temp[pos--]=array[j--];
            }

        }
        for (;i>=low;i--){
            temp[pos--]=array[i];
        }
        for (;j>mid;j--){
            temp[pos--]=array[j];
        }

        for (int s=low;s<=high;s++){
            array[s]=temp[s];
        }
        count+=leftcount+rightcount;
        count%=NUM;
        return count;
    }

    private static int NUM=1000000007;


}
