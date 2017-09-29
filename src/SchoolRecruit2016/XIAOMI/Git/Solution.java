package SchoolRecruit2016.XIAOMI.Git;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int getSplitNode(String[] matrix, int indexA, int indexB) {
        if (matrix == null || matrix.length == 0) return 0;
        int length = matrix.length;
        int[][] numMatrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i].charAt(j) == '1') {
                    numMatrix[i][j] = 1;
                }
            }
        }

        List<List<Integer>> lists =new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        list.add(0);

        return 0;
    }
}
