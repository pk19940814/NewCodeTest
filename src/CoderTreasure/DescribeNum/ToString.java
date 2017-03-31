package CoderTreasure.DescribeNum;

/**
 * Created by apple on 2017/3/27.
 */
public class ToString {
    public String toString(int x) {
        // write code here
        if (x==0) return "Zero";
        int n=x;
        String[] llion={"Thousand","Million","Billion","Trillion","Quadrillion","Quintillion","Sextillion",
                "Septillion","Octillion"};
        String[] num={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve",
                "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String [] decade={"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String result="";
        int k=0;
        while (n!=0){
            int temp=n%1000;
            if (temp>0){
                if (temp==0) continue;
                String t="";
                if (temp!=0){
                    if (temp/100!=0){
                        t+=(num[temp/100]+" Hundred ");
                        temp=temp%100;
                    }

                    if (temp<20&&temp>0){
                        t+=num[temp];
                    }
                    else if (temp>=20){
                        t+=decade[temp/10-2];
                        if (temp%10!=0) t+=" ";
                        t+=num[temp%10];
                    }

                }
                if (k>0){
                    t+=" "+llion[k-1]+",";
                }
                result=t+result;


            }
            k++;
            n/=1000;
        }
        while (result.charAt(result.length()-1)==','){
            result=result.substring(0,result.length()-1);
        }

        return result;
    }
}
