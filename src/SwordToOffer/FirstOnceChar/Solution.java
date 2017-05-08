package SwordToOffer.FirstOnceChar;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {

    public int FirstNotRepeatingChar(String str) {

        int [] Alphabet=new int[52];
        int[] CharPos=new int[52];
        for (int i=0;i<52;i++) CharPos[i]=10001;
        int pos=10001;
        for (int i=0;i<str.length();i++){
            int p;
            char c=str.charAt(i);


            if (c-'A'<26&&c-'A'>=0) p=c-'A'+26;
            else   p=c-'a';

            if (CharPos[p]>i){
                CharPos[p]=i;
            }
            Alphabet[p]++;

        }
        for (int i=0;i<52;i++){
            if (Alphabet[i]==1) {
                if (pos>CharPos[i])
                    pos=CharPos[i];
            }
        }
        if(pos==10001) pos=-1;
        return pos;
    }
}
