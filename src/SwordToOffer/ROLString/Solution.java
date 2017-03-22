package SwordToOffer.ROLString;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {
    public String LeftRotateString(String str,int n) {
        if (str.length()*n==0) return str;

        n=n%str.length();
        String strr=str.substring(n);
        String strl=str.substring(0,n);
        return strr+strl;

    }
}
