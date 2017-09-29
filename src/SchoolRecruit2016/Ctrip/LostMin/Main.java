package SchoolRecruit2016.Ctrip.LostMin;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int findMinMis(int[] A) {
        int k = 1;
        List<Integer> list = new ArrayList<>();
        for (int t : A) {
            if (t > 0) {
                list.add(t);
            }
        }

        Collections.sort(list);
        if (list.size() == 0 || list.get(0) > 1) {
            return k;
        }


        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) > 1) {
                k = list.get(i - 1) + 1;
                break;
            }
        }

        return k;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _A_size = 0;
        _A_size = Integer.parseInt(in.nextLine().trim());
        int[] _A = new int[_A_size];
        int _A_item;
        for (int _A_i = 0; _A_i < _A_size; _A_i++) {
            _A_item = Integer.parseInt(in.nextLine().trim());
            _A[_A_i] = _A_item;
        }

        res = findMinMis(_A);
        System.out.println(String.valueOf(res));

    }
}

