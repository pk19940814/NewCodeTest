package SchoolRecruit2016.DiDi.MethodsOfSum;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Set<String> set = new HashSet<>();
            int n = in.nextInt();
            int sum = in.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = in.nextInt();
            }
            int cases = count(0, A, sum);
            System.out.println(cases);
        }
    }

    public static int count(int index, int[] A, int sum) {
        if (sum == 0) {

            return 1;
        }
        if (index >= A.length || sum < 0) {
            return 0;
        }
        return count(index + 1, A, sum) + count(index + 1, A, sum - A[index]);
    }
}
