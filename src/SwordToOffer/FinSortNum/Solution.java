package SwordToOffer.FinSortNum;

/**
 * Created by apple on 2017/3/20.
 */
public class Solution {

    public int GetNumberOfK(int [] array , int k) {
        if (array.length==0 )return 0;
        int len=array.length-1;
        int start=0;
        int end=len;
        int count=0;
        int mid=(start+end)/2;
        while (start<=end){
            if (array[mid]== k) break;
            else if (array[mid]>k) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            mid=(start+end)/2;
        }
       // System.out.print("hello"+mid);
        if (array[mid]==k){
            count++;
            int p=mid+1;
            int q=mid-1;
            while (p<=len&&array[p]==k){
                count++;
                p++;
            }
            while (q>=0&&array[q]==k){
                count++;
                q--;
            }
        }
        return count;
    }
}
