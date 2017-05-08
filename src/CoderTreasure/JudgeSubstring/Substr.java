package CoderTreasure.JudgeSubstring;

/**
 * Created by apple on 2017/4/4.
 */
public class Substr {

    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] result=new boolean[n];
        for (int i=0;i<n;i++) result[i]=false;
        for (int i=0;i<n;i++){//遍历字符串数组里每一个字符串

            for (int j=0;j<s.length();j++){//对每一个字符串 开始匹配 字符串s
                if (p[i].length()>s.length()-j) {
                    result[i]=false;
                    break;
                }
                if (p[i].charAt(0)==s.charAt(j)){
                    for (int k=0;k<p[i].length();k++){
                        if (s.charAt(k+j)!=p[i].charAt(k)) break;
                        if (k==p[i].length()-1) result[i]=true;
                    }
                    if (result[i]==true) break;
                }

            }

        }
        return result;
    }

}
