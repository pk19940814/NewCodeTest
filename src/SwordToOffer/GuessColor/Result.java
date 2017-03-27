package SwordToOffer.GuessColor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by apple on 2017/3/26.
 */
public class Result {
    public int[] calcResult(String A, String guess) {
        // write code here
        int[] count={0,0};
        ArrayList<Character> listA=new ArrayList<Character>(),listguess=new ArrayList<Character>();
        for (int i=0;i<4;i++){
            listA.add(A.charAt(i));
            listguess.add(guess.charAt(i));
        }

        for (int i=0;i<listA.size();){
            if (listA.get(i)==listguess.get(i)) {
                count[0]++;
                listA.remove(i);
                listguess.remove(i);
            }
            else i++;
        }

        for (int i=0;i<listA.size();i++){
            for (int j=0;j<listguess.size();j++){
                if (listA.get(i)==listguess.get(j)){
                    listA.remove(i);
                    listguess.remove(j);
                    i--;
                    count[1]++;
                    break;
                }
            }
        }


        return count;
    }
}
