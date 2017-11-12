package SchoolRecruit2016.NetEase.NumGame;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }
            Collections.sort(list);


        }
    }

    private static int getMaxSum(List<Integer> list, List<Integer> ignore) {
        if (ignore == null) {
            ignore = new ArrayList<>();
        }
        if (list == null || list.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!ignore.contains(i)) {
                sum += list.get(i);
                List<Integer> temp = new ArrayList<>();
                temp.addAll(ignore);
                temp.add(i);

            }
        }


    }


}
