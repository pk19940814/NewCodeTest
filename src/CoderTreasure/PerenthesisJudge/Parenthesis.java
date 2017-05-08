package CoderTreasure.PerenthesisJudge;

/**
 * Created by apple on 2017/3/26.
 */
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        int left=0,right=0;
        for (int i=0;i<n;i++){
            if (A.charAt(i)==')') {
                right++;
                if (right>left) return false;
            }
            if (A.charAt(i)<='9'&&A.charAt(i)>='0'||A.charAt(i)<='a'&&A.charAt(i)>='z'
                    ||A.charAt(i)<='Z'&&A.charAt(i)>='A') {
                if (i>0&&A.charAt(i-1)==')') return false;
                if (i<n-1&&A.charAt(i+1)=='(') return false;
            }
            if (A.charAt(i)=='(') left++;
        }
        if (left!=right) return false;
        return true;
    }
}