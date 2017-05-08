package CoderTreasure.SubsetPrint;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/26.
 */
public class Subset {
    public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
        ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
        sort(A,0,n);
        ArrayList<Integer> listA=new ArrayList<Integer>();
        for (int i=n-1;i>=0;i--)
        {
            ArrayList<Integer> listtemp=new ArrayList<Integer>();
            listtemp.add(A[i]);
            lists.add(listtemp);
        }

    return null;

    }

    public void sort(int[] nums,int low,int high){
        int mid=(low+high)/2;
        if (low<high){
            sort(nums,low,high);
            sort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }

    }

    public void merge(int[] nums,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=high){
            if (nums[i]<nums[j])
            temp[k++]=nums[i++];
            else temp[k++]=nums[j++];
        }

        while (i<=mid){
            temp[k++]=nums[i++];
        }
        while (j<=high){
            temp[k++]=nums[j++];
        }
        for (int k2=0;k2<temp.length;k2++){
            nums[k2+low]=temp[k2];
        }
    }

}
