package CoderTreasure.BinaryFloat;

/**
 * Created by apple on 2017/3/25.
 */
public class BinDecimal {
    public String printBin(double num) {
        // write code here
        double count=0.5,k=0;
        String str="0.";
        while (k<32){
            if (num>count){
                str+='1';
                num-=count;
            }
            else if (num==count){
                str+="1";
                break;
            }
            else {
                str+='0';
            }
            count/=2;

            k++;
        }
        if (num!=count) return "Error";
        else return str;

    }

}
