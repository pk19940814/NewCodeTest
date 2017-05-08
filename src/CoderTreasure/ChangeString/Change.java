package CoderTreasure.ChangeString;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by apple on 2017/4/4.
 */
public class Change {
    public Change() {

        set=new HashSet<String>();

    }

    public int countChanges(String[] dic, int n, String s, String t) {
        // write code here
        if (s.length()!=t.length()) return -1;
        set.add(s);
        if (s.equals(t)) return 0;
        Set<String> setstring=new HashSet<String>();
        for (String  temp:dic
                ) {
            if (temp.length()==s.length()) {
                setstring.add(temp);
                if (JudgeNearest(temp,s)) set.add(temp);
            }

        }
        if (setstring.size()==0) return -1;

        int result=1;
        while (result<=setstring.size()+1){
            Set<String> set1=new HashSet<String>();
            for (String str:set
                    ) {
                if (t.equals(str)) {
                    // System.out.print(t+"   "+str);
                    return result;
                }
                for (String str1:setstring
                        ) {
                    if (JudgeNearest(str1,str)) set1.add(str1);
                }
            }

            set=null;
            set=set1;


            result++;
        }


        return result-1;


    }

    public boolean JudgeNearest(String s,String t){
        int count=0;


        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=t.charAt(i)){
                count++;
                if (count==2) return false;
            }
        }
        return true;
    }




    private Set<String> set;

}
