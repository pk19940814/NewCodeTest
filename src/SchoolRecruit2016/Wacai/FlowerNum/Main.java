package SchoolRecruit2016.Wacai.FlowerNum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            List<Integer> list = new ArrayList<>();
            int var1 = in.nextInt();
            int var2 = in.nextInt();
            for (int i = var1; i <= var2; i++) {
                String var3 = String.valueOf(i);
                int sum = 0;
                for (int j = 0; j < var3.length(); j++) {
                    int a = var3.charAt(j) - '0';
                    sum += a * a * a;
                }
                if (sum == i) {
                    list.add(sum);
                }
            }
            if (list.size() == 0) {
                System.out.println("no");
            } else {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if (i != list.size() - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
            }
        }
    }
}
