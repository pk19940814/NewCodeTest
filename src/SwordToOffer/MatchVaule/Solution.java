package SwordToOffer.MatchVaule;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {
    public boolean match(char[] str, char[] pattern)
    {

        String s="",p="";
        for (int i=0;i<str.length;i++){
            s+=str[i];
        }
        for (int i=0;i<pattern.length;i++){
            p+=pattern[i];
        }

        return Judge(s,p);
    }

    public  boolean Judge(String str,String pattern){
        if (str.length()==0&&pattern.length()==0) return true;

        if (str.length()==0&&pattern.length()>0){
            if (pattern.length()%2==1) return false;
            for (int i=0;i<pattern.length();){
                if (pattern.charAt(i+1)=='*') i+=2;
                else

                    return false;


            }

            return true;

        }
        if (str.length()>0&&pattern.length()==0) return false;




            if (pattern.length() > 1) {
                if (pattern.charAt(1) != '*') {

                    if (str.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.') {
                        String s1 = str.substring(1);
                        String s2 = pattern.substring(1);
                        return Judge(s1, s2);

                    }
                    return false;
                } else {

                    if (str.charAt(0) != pattern.charAt(0)&&pattern.charAt(0)!='.') {
                        String s = pattern.substring(2);
                        return Judge(str, s);
                    } else {
                        String p = pattern.substring(2);
                        String s = str.substring(1);
                        return Judge(str, p) || Judge(s, p) || Judge(s, pattern);

                    }
                }

            } else {
                if (str.charAt(0) == pattern.charAt(0)||pattern.charAt(0)=='.')
                    return Judge(str.substring(1), pattern.substring(1));
                else return false;

            }



    }

}
