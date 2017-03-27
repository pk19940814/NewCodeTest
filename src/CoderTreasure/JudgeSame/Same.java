package CoderTreasure.JudgeSame;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by apple on 2017/3/24.
 */
public class Same {
    public boolean checkSam(String stringA, String stringB) {
        if (stringA.length()!=stringB.length()) return false;
        Set<Character> setA=new LinkedHashSet<>();
        Set<Character> setB=new LinkedHashSet<>();
        for (int i=0;i<stringA.length();i++){
            setA.add(stringA.charAt(i));
            setB.add(stringB.charAt(i));
        }

        if (setA.equals(setB)) return true;
        return  false;
        // write code here
    }
}
