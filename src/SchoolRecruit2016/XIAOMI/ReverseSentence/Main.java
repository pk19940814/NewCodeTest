package SchoolRecruit2016.XIAOMI.ReverseSentence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.next());
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
