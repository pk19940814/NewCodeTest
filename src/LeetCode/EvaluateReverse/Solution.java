package LeetCode.EvaluateReverse;

import java.util.Stack;

/**
 * Created by apple on 2017/4/17.
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> strings = new Stack<Integer>();

        for (String temp : tokens
                ) {
            if (temp.equals("+")) {
                Integer a = strings.pop();
                Integer b=strings.pop();
                strings.push(b+a);
            } else if (temp.equals("-")) {
                Integer a = strings.pop();
                Integer b=strings.pop();
                strings.push(b-a);
            } else if (temp.equals("*")) {
                Integer a = strings.pop();
                Integer b=strings.pop();
                strings.push(b*a);
            } else if (temp.equals("/")) {
                Integer a = strings.pop();
                Integer b=strings.pop();
                strings.push(b/a);
            } else strings.push(Integer.valueOf(temp));
        }

        return strings.pop();
    }
}
