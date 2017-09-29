package SchoolRecruit2016.MicroSoft.WaterCollection;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    /**
     * @param heights: a matrix of integers
     * @return: an integer
     */
    public int trapRainWater(int[][] heights) {
        // write your code here
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (j == 0 || i == 0 || i == heights.length - 1 || j == heights[0].length - 1) {
                    continue;
                }
                int a = heights[i - 1][j];
                int b = heights[i + 1][j];
                int c = heights[i][j - 1];
                int d = heights[i][j + 1];

                int min = a > b ? b : a;
                min = min > c ? c : min;
                min = min > d ? d : min;
                if (min > heights[i][j]) {
                    sum += min - heights[i][j];
                }
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new LinkedHashSet<>();
        while (in.hasNext()) {
            int i=in.nextInt();
            if (i==0) break;
            set.add(i);
        }

        System.out.println("============");
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}