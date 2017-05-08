package CoderTreasure.EnsureDifference;

/**
 * Created by apple on 2017/3/24.
 */
public class Different {
    public boolean checkDifferent(String iniString) {
        // write code here
        for (int i=0;i<iniString.length()-1;i++){
            for (int j=i+1;j<iniString.length();j++){
                if (iniString.charAt(i)==iniString.charAt(j)) return false;
            }
        }
        return true;
    }
}
