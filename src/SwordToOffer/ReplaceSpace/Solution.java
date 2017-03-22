package SwordToOffer.ReplaceSpace;

/**
 * Created by apple on 2017/3/16.
 */
public class Solution {

    public String replaceSpace(StringBuffer str){
        int m=str.indexOf(" ");
        while(m!=-1){
            str.deleteCharAt(str.indexOf(" "));
            str.insert(m,"%20");
            m=str.indexOf(" ");
        }
        return str.toString();
    }
}
