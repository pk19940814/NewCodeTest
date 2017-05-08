package CoderTreasure.ZipChar;

/**
 * Created by apple on 2017/3/24.
 */
public class Zipper {
    public String zipString (String iniString){

        if (iniString.length()<2) return iniString;
        String temp="";
        int count=1;
        for (int i=1;i<iniString.length();i++,count++){
            if (iniString.charAt(i)!=iniString.charAt(i-1)){
                temp+=iniString.charAt(i-1);
                temp+=count;
                count=0;
            }
        }
        temp+=iniString.charAt(iniString.length()-1);
        temp+=count;

        if (temp.length()==iniString.length()*2) return iniString;
        return temp;
    }
}
