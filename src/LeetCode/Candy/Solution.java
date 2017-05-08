package LeetCode.Candy;

/**
 * Created by apple on 2017/4/20.
 */
public class Solution {
    public int candy(int[] ratings) {
        int sum=0;
        int []candies=new int[ratings.length];
        int min=0;

       for (int i=1;i<ratings.length;i++){
           if (ratings[i]>ratings[i-1]) candies[i]=candies[i-1]+1;
           else if (ratings[i]<ratings[i-1]) candies[i]=candies[i-1]-1;
          else {

                int needs=0;
                if (candies[min]<1)needs=1-candies[min];
              if (candies[i-1]+needs==1)
               candies[i]=candies[i-1];
              else candies[i]=candies[i-1];
           }

           if (candies[i]<candies[min]) min=i;
           sum+=candies[i];
       }
        if (candies[min]<1)
       sum+=(1-candies[min])*ratings.length;

        return sum;
    }
}
