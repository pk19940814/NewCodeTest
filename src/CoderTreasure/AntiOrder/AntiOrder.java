package CoderTreasure.AntiOrder;

/**
 * Created by apple on 2017/3/26.
 */
public class AntiOrder {
    public int count(int[] A, int n) {
        // write code here



Sort(A,0,n-1);
        return count;
    }

    public void Sort(int[] nums,int low,int high){
        int mid=(low+high)/2;
        if (low<high){
            Sort(nums,low,mid);
            Sort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    public void merge(int[]nums,int low,int mid,int high){
        int [] temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=high){
            if (nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }else {
                temp[k++]=nums[j++];
                count+=j-mid-1;
            }

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

    private int count=0;
}
