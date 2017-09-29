package SchoolRecruit2016.DiDi.XOR;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int num = 0;
            int result[] = new int[n];
            int nums[] = new int[n];
            int index = -1;
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
                if (nums[i] == 0) {
                    result[i] = 0;
                } else {
                    if (i > 0) {
                        result[i] = result[i - 1] ^ nums[i];

                    } else {
                        result[i] = nums[i];
                    }
                }
                if (result[i] == 0) {
                    num++;
                    index = i;
                } else {
                    int temppp = result[i];
                    for (int j = index + 1; j < i; j++) {
                        temppp = temppp ^ nums[j];
                        if (temppp == 0) {
                            num++;
                            index = i;
                        }
                    }
                }


            }

            System.out.println(num);
        }
    }
}
