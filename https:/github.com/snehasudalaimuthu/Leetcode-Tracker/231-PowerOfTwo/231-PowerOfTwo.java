// Last updated: 09/07/2026, 11:17:44
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;

    }
}