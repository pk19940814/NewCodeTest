package SwordToOffer.IsLucky;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length==0) return false;
        boolean zero=false;
        int count=0;
        for(int i=0;i<5;i++){
            numbers[i]%=10;
            if (numbers[i]==0) {
                zero=true;
                count++;
            }
            if (count>=4) return true;
        }
        for (int i=1;i<5;i++){
            int temp=numbers[i];
            int j=i-1;
            for (;j>=0;j--){
                if (numbers[j]>temp){
                    numbers[j+1]=numbers[j];
                }
                else break;
            }
            numbers[j+1]=temp;
        }
        if (!zero) {
            for (int i = 1; i < 5; i++) {
                if (numbers[i] != numbers[0] + i) return false;
            }
        }
        else {
            int min=0;
            int max=numbers[4];
            for (int i=0;i<5;i++){
                if (numbers[i]!=0) {
                    if (numbers[i-1]==0)
                    min=numbers[i];
                    if (numbers[i-1]>=numbers[i]) return false;
                }



            }
            if (max-min>4) return false;
        }

        return true;
    }
}
