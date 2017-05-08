package CoderTreasure.SortStack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by apple on 2017/3/24.
 */
public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
       Stack<Integer> stack1=new Stack<Integer>(),stack2= new Stack<Integer>();
       for (int i=0;i<numbers.length;i++){
           if (stack1.isEmpty()){
               stack1.push(numbers[i]);
           }else {
             while (!(stack1.isEmpty()||stack1.peek()>=numbers[i]) ){
                 stack2.push(stack1.pop());
             }
             stack1.push(numbers[i]);
             while (!stack2.isEmpty()){
                 stack1.push(stack2.pop());
             }
           }
       }
       ArrayList<Integer> list=new ArrayList<Integer>();
        for (int a:stack1
             ) {
            list.add(a);
        }
        return list;
    }
}
