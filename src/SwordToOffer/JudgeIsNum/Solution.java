package SwordToOffer.JudgeIsNum;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public boolean isNumeric(char[] str) {
        boolean isDouble = false;
        int length = str.length;

        for (int i = 0; i < length; i++) {//是否第一个是正号、负号，是否有小数点，是否只有一个小数点，
            switch (str[i]) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;

                case '+':

                case '-':
                    if (i!=0)
                    return false;
                    if (str[i+1]=='.') i++;
                    break;

                case '.':
                    if (!isDouble) isDouble=true;
                    else return false;
                    break;
                case 'E':
                case 'e':
                    if (i==length-1||i==0) return false;
                    if (!(str[i-1]<='9'&&str[i]>='0')) return false;
                    if ((str[i+1]=='-'||str[i+1]=='+')&&i==length-2) return false;
                    else i++;
                    isDouble=true;
                    break;




                default:
                    return false;

            }
        }
        return true;
    }
}