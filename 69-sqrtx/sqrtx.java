class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        int i;
        for (i = 1; (long)i * i <= x; i++) {
            if ((long)i * i == x) {
                return i;
            }
        }
        return i - 1;
    }
}