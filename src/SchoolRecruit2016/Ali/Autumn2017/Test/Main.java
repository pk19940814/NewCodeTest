package SchoolRecruit2016.Ali.Autumn2017.Test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    /**
     * 在我理解，肯定要尽可能的多利用分值最高的那个靶子，留在最后。那么可以迭代。
     * 找出最高的，分为左右两个靶子组，左右靶子组，再找其中最高的，以此类推.
     */
    /**
     * 思索，又觉得上述理解点，错误。不是考虑最高的，而是如何先把最低的给消灭掉！！！因此 先找到最低的。
     */
    /**
     * 第一种思路是对的，不过时间来不及了.或许，每一次射击都遍历一遍，找到能使该次射击得分最大的点？？？
     */
    static int maxScore(int[] score) {
        List<Integer> list = new LinkedList<>();
        if (score.length == 0) {
            return 0;
        }
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
        }

        return maxScores(list);
    }

    static int maxScores(List<Integer> list) {
        if (list.size() == 0) {//大小为0的list
            return 0;
        }

        //0的个数和size大小一样
        int zero_length = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                zero_length++;
            }
        }
        if (zero_length == list.size()) {
            return 0;
        }

        int max = 0;
        int posmax=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                continue;
            }
            int score = list.get(i);
            if (!(i - 1 < 0 || list.get(i - 1) == 0)) {
                score *= list.get(i - 1);
            }
            if (!(i + 1 >= list.size() || list.get(i + 1) == 0)) {
                score *= list.get(i + 1);
            }
            if (score > max) {
                max = score;
                posmax=i;
            }
        }

        list.remove(posmax);
        return max+maxScores(list);

        /*int pos = findMin(list);
        int score = list.get(pos);
        //计算当前射击最小的得分。考虑左右不存在与不能射击的情况
        boolean left = true;
        boolean right = true;
        if (pos - 1 < 0 || list.get(pos - 1) == 0) {
            left = false;
        }
        if (pos + 1 >= list.size() || list.get(pos + 1) == 0) {
            right = false;
        }
        if (left) {
            score *= list.get(pos - 1);
        }
        if (right) {
            score *= list.get(pos + 1);
        }
        list.remove(pos);

        return score + maxScores(list);*/

    }

    static int findMin(List<Integer> list) {
        /**
         * 这个函数，负责找出当前靶子组的最低分的位置
         */
        int min = list.get(0);
        int pos = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _score_size = 0;
        _score_size = Integer.parseInt(in.nextLine().trim());
        int[] _score = new int[_score_size];
        int _score_item;
        for (int _score_i = 0; _score_i < _score_size; _score_i++) {
            _score_item = Integer.parseInt(in.nextLine().trim());
            _score[_score_i] = _score_item;
        }

        res = maxScore(_score);
        System.out.println(String.valueOf(res));

    }
}
