package SchoolRecruit2016.Qunar.Coder;

import java.util.*;

public class Coder {
    public String[] findCoder(String[] A, int n) {
        // write code here
        List<String> result = new LinkedList<>();
        for (String temp : A
                ) {
            String lowCase = temp.toLowerCase();
            if (temp.toLowerCase().indexOf("coder") != -1) {
                result.add(0, temp);
            }
        }
        String[] B = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            B[i] = result.get(i);
        }
        return B;
    }
}
