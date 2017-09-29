package CMBCC.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                list.add(in.nextInt());
            }
            if (compete(list) > 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
    }

    //求当前第一个人的选择最多能比第二个人多多少
    private static Integer compete(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        //取一个
        Integer first = list.get(0);
        Integer firstCompete = 0;
        Integer secondCompete = 0;

        if (list.size() > 1) {
            List<Integer> subList1 = list.subList(1, list.size() );
            firstCompete = first - compete(subList1);
        } else {
            firstCompete = first;
        }


        if (list.size() < 2) {
            secondCompete = 0;
        } else if (list.size() == 2) {
            secondCompete = list.get(0) + list.get(1);
        } else {
            List<Integer> subList2 = list.subList(2, list.size() );
            secondCompete = list.get(0) + list.get(1) - compete(subList2);
        }

        return firstCompete > secondCompete ? firstCompete : secondCompete;
    }
}
