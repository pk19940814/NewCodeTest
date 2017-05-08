package CoderTreasure.LookForWord;

/**
 * Created by apple on 2017/3/27.
 */
public class Frequency {
    public int getFrequency(String[] article, int n, String word) {
        // write code here
        int count=0;
        for (String temp:article
             ) {
            if (temp.equals(word))
                count++;
        }
        return count;
    }
}