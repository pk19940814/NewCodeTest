package SchoolRecruit2016.NetEase.NumGame;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }
            list = sort(list);
            System.out.println(list);
            if (list.get(0) > 1) {
                System.out.println(list.get(0) - 1);
            } else {
                int flag = list.get(0) + 1;
                list.remove(0);
                while (!list.isEmpty()) {
                    int temp = list.get(0);
                    if (flag < temp) {
                        break;
                    }
                    flag = temp + 1;
                    list.remove(0);
                }
                System.out.println(flag);
            }
        }
    }

    public static List<Integer> sort(List<Integer> list) {
        if (list.size() == 0) {
            return new ArrayList<>();
        }
        Integer flag = list.get(0);
        List<Integer> listLeft = new ArrayList<>();
        List<Integer> listRight = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < flag) {
                listLeft.add(list.get(i));
            } else {
                listRight.add(list.get(i));
            }
        }

        result.addAll(sort(listLeft));
        result.add(flag);
        result.addAll(sort(listRight));
        return result;
    }
}
