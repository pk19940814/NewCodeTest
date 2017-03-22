package SwordToOffer.AddNoOP;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {
    public int Add(int num1,int num2) {
       int num=0;
       while (num1!=0) {
           if (num1 < 0) {
               num1++;
               num--;
           } else {
               num1--;
               num++;
           }
       }


        while (num2!=0) {
            if (num2 < 0) {
                num2++;
                num--;
            } else {
                num2--;
                num++;
            }
        }
       return num;
    }
    //使用位运算解决
    public int AddByte(int num1,int num2){
        int bitsum=num1^num2;
        int bitpre=(num1&num2)<<1;
        do {
            int temp1=bitsum,temp2=bitpre;
            bitsum=temp1^temp2;
            bitpre=(temp1&temp2)<<1;
        }while (bitpre!=0);
    return bitsum;
    }

}
