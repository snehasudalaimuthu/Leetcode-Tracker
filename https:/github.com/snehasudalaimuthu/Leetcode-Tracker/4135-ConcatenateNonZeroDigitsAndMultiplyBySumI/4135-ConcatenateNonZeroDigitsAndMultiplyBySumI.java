// Last updated: 09/07/2026, 09:46:36
class Solution {
    public long sumAndMultiply(int n) {
        long x = 0, s = 0;
        for (char c : String.valueOf(n).toCharArray())
            if (c != '0') {
                x = x * 10 + c - '0';
                s += c - '0';
            }
        return x * s;
    }
}