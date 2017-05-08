package SwordToOffer.MidNum;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {

    public Solution(){
        nums=new ArrayList<Integer>();
    }
    public void Insert(Integer num) {
        nums.add(num);
       // Sort();
        for (int a:nums
             ) {
            System.out.print(a);
        }

        System.out.println();

    }

    public Double GetMedian() {
        Sort();

        if (nums.size()%2==1)  return (double)nums.get(nums.size()/2);
          return (double)(nums.get(nums.size()/2)+nums.get(nums.size()/2-1))/2;
    }
    public void Sort(){
        int size=nums.size();
        for (int i=1;i<size;i++){
            int temp=nums.get(i);
            int j=i;
            for (;j>0;j--){
                if (nums.get(j-1)>temp) nums.set(j,nums.get(j-1));
                else break;
            }
            nums.set(j,temp);
        }
    }
    private ArrayList<Integer> nums;
}
