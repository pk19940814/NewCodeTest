package SchoolRecruit2016.Qunar.FirstRepeat;

import java.util.*;

public class FirstRepeat {
    private Set<Character> set;

    public char findFirstRepeat(String A, int n) {
        // write code here
        set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            char c = A.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
            } else {
                return c;
            }
        }
        return 'a';
    }
}