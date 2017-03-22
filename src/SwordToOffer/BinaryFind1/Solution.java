package SwordToOffer.BinaryFind1;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public int NumberOf1(int n) {

        int count=0;
        boolean flag=false;
       if(n<0){
           n=-1-n;
           flag=true;
       }
       do{
           if(n%2==1) count++;
        n/=2;
       }while (n!=0);

       if(flag) count=32-count;
       return count;


    }
}
