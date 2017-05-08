package CoderTreasure.FindLongestWord;

/**
 * Created by apple on 2017/3/27.
 */
public class LongestString {
    public int getLongest(String[] str, int n) {
        // write code here
        int max=0;

        for (int i=0;i<n;i++){
            int m=getLength(str[i],str,n,0);
            max=m>max?m:max;
        }

        return max;
    }
    public int getLength(String string,String[] strings,int n,int count){

        int len=0;
        if (string.equals("")) return len;
        for (int i=0;i<n;i++){
            if (strings[i].charAt(0)==string.charAt(0)){
                if (count==0&&strings[i].equals(string)) continue;
                int j=0;
                for (;j<strings[i].length()&&j<string.length();j++){
                    if (strings[i].charAt(j)!=string.charAt(j)) break;
                }
                int tlen=j+getLength(string.substring(j),strings,n,count+1);
                len=tlen>len?tlen:len;

            }

        }
        return len;

    }
}