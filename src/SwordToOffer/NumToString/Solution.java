package SwordToOffer.NumToString;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {
    public int StrToInt(String str) {
        int length=str.length();
        int result=0;


        boolean ispositive=true;
        for (int i=0;i<length;i++){//是否第一个是正号、负号，是否有小数点，是否只有一个小数点，
            switch (str.charAt(i)){
                case '0':
                case  '1':
                case  '2':
                case '3':
                case  '4':
                case  '5':
                case '6':
                case  '7':
                case  '8':
                case '9':
                {

                    int num=str.charAt(i)-'0';
                    result=result*10+num;
                    break;
                }
                case '+': {
                    if (i!=0) return 0;
                    ispositive=true;
                    break;
                }
                case '-': {
                    if (i!=0) return 0;
                    ispositive=false;
                    break;
                }


                default:return 0;

            }
        }
        if (!ispositive) result =-result;
        return result;
    }
}
