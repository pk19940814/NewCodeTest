package SchoolRecruit2016.Qunar.BinarySearch;

public class BinarySearch {
    private int index = -1;
    private int[] arrays;

    public int getPos(int[] A, int n, int val) {
        // write code here
        arrays = A;
        findPos(0, n - 1, val);
        return index;
    }

    private void findPos(int start, int end, int val) {
        if (end < start || start < 0 || end >= arrays.length) return;
        int mid = (start + end) / 2;
        if (arrays[mid] == val) {
            if (index == -1) {
                index = mid;
            } else if (index > mid) {
                index = mid;
            }
        }
        if (arrays[mid] <= val) {
            findPos(mid + 1, end, val);
        }
        if (arrays[mid] >= val) {
            findPos(start, mid - 1, val);
        }
    }

}
