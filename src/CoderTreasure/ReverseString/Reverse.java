package CoderTreasure.ReverseString;

/**
 * Created by apple on 2017/3/24.
 */
public class Reverse {
    public String reverseString(String iniString){

        int length=iniString.length()-1;
        if (iniString.length()<1) return iniString;

        for (int i=0;i<=length/2;i++){
            //char temp=iniString.charAt(i);
            if (i*2==length) continue;
            String presub=iniString.substring(0,i);
            //System.out.println("pre"+presub);
            String minsub=iniString.substring(i+1,length-i);
         //  System.out.println("mid"+minsub);
            String lastsub=iniString.substring(length-i+1);
           // System.out.println("last"+lastsub);
            iniString =presub+iniString.charAt(length-i)+minsub+iniString.charAt(i)+lastsub;
           // System.out.println("ini"+iniString);

        }
        return iniString;
    }
}
