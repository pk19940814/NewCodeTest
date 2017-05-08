package CoderTreasure.ReverseEqual;

/**
 * Created by apple on 2017/3/24.
 */
public class ReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        //System.out.print("hi");
        if (s1.length()!=s2.length()) return false;
       // System.out.print("length");
        for (int i=0;i<s1.length();i++){
            if (s2.charAt(i)==s1.charAt(0)){
                String temp=s2.substring(i)+s2.substring(0,i);
                //System.out.println(s1);
                //System.out.println(s2);
                //System.out.println(temp);
                if (temp.equals(s1)){
                    return true;
                }
            }
        }

        return false;
    }
}