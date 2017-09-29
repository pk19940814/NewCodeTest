package SchoolRecruit2016.DiDi.MaxSubString;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Integer sum = 0;
        int i=0;
        while (in.hasNext()) {
            stack.push(in.nextInt());
            if (i==0){
                sum=stack.peek();
            }
            i++;
            int temp = count(stack);
            if (temp < 0) {
                stack = new Stack<>();
                sum = sum > temp ? sum : temp;
            } else {
                sum = sum > temp ? sum : temp;
            }
        }
        System.out.println(sum);

    }

    public static int count(Stack<Integer> stack) {
        Integer sum = 0;
        for (Integer i : stack) {
            sum += i;
        }
        return sum;
    }
}
