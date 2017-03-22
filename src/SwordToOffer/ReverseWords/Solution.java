package SwordToOffer.ReverseWords;

import java.util.Stack;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public String ReverseSentence(String str) {
        Stack<String> stack=new Stack<String>();
        for (int i=0;i<str.length();i++){
            String temp ="";
            while (i<str.length()&&str.charAt(i)!=' '){
                 temp+=str.charAt(i);

               i++;
            }
            stack.push(temp);


        }
        String result="";
        while (!stack.isEmpty()){
            result+=stack.pop();
            result+=" ";
        }
        return result.substring(0,str.length());
    }
}
