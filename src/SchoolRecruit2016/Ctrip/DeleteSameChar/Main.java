package SchoolRecruit2016.Ctrip.DeleteSameChar;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            Set<Character> set = new HashSet<>();
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (!set.contains(str.charAt(i))) {
                    result += str.charAt(i);
                    set.add(str.charAt(i));
                }
            }
            System.out.println(result);
        }
    }
}
