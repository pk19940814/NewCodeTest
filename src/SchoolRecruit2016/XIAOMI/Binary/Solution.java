package SchoolRecruit2016.XIAOMI.Binary;

public class Solution {
    public int countBitDiff(int m, int n) {
        int result = m ^ n;
        int count = 0;
        while (result != 0) {
            if (result % 2 == 1) {
                count++;
            }
            result >>= 1;
        }
        return count;
    }
}
