package SwordToOffer.StackMin;

import java.util.Stack;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {



    public void push(int node) {
     if (stack.isEmpty()) a=node;
    stack.push(node);

    if (node<a) a=node;

    }

    public void pop() {

        if((int)stack.pop()==a) reset();
    }

    public int top() {

return (int)stack.peek();
    }

    public int min() {

        return a;
    }

    private void reset(){
        a=(int)stack.peek();
        for (Object b:stack
                ) {
            if ((int)b<a)  a=(int)b;
        }
    }
    private int a;
    private Stack stack= new Stack();
    //private Stack stack2= new Stack();
}
