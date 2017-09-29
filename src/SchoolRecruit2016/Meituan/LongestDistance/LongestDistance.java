package SchoolRecruit2016.Meituan.LongestDistance;


import java.util.*;

public class LongestDistance {
    private int maxNum;
    private int minNum;
    private int dist = 0;
    private int length;
    private int[] B;
    private boolean flag;

    public int getDis(int[] A, int n) {
        // write code here
        flag = false;
        B = A;
        maxNum = A[0];
        minNum = A[0];
        length = n;
        calDist(0);
        return dist;
    }

    private void calDist(int index) {
        if (index >= length) return;
        if (flag) {
            if (dist < B[index] - minNum) {
                flag = false;
                dist = B[index] - minNum;
                maxNum = B[index];
            }
            if (B[index] < minNum) {
                minNum = B[index];
                flag = true;
            }
        } else if (B[index] > maxNum) {
            dist = dist + B[index] - maxNum > B[index] - minNum ? dist + B[index] - maxNum : B[index] - minNum;
            maxNum = B[index];
        } else if (B[index] < minNum) {
            minNum = B[index];
            flag = true;
        }
        calDist(index + 1);
    }
}
