package SchoolRecruit2016.GoodFuture.Miniestk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            int k = 0;
            int[] array = new int[line.length() / 2];
            for (int i = 0; i < line.length(); i++) {
                if (i == line.length() - 1) {
                    k = line.charAt(i) - '0';
                    break;
                }

                if (line.charAt(i) <= '9' && line.charAt(i) >= 0) {
                    array[i] = line.charAt(i) - '0';
                }

            }
            buildMinHeap(array);
        }
    }

    public static void buildMinHeap(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustDownToUp(array, i, array.length);
        }
        return;
    }

    public static void adjustDownToUp(int[] array, int k, int length) {
        int temp = array[k];
        for (int i = 2 * k + 1; i < length - 1;i++){


        }
    }

}
