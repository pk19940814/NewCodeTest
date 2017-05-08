package SwordToOffer.FindStringInputUnique;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public void Insert(char ch)
    {
        string+=ch;
    }

    public char FirstAppearingOnce()
    {
for (int i=0;i<string.length();i++){
    int count=0;
    for (int j=0;j<string.length();j++){
        if (string.charAt(i)==string.charAt(j)) count++;
    }
    if (count==1) return string.charAt(i);
}
return '#';
    }
    private String string="";
}
