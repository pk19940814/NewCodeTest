package CoderTreasure.ReplaceSpace;

/**
 * Created by apple on 2017/3/24.
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        //int index =iniString.indexOf(" ");

        return iniString.replaceAll(" ","%20");
        // write code here
    }
}