// Last updated: 09/07/2026, 11:20:44
class Solution {
    public int divide(int dividend, int divisor) {

        // Example we are tracking:
        // dividend = 43, divisor = 3
        // Expected answer = 14

        boolean sign = false;
        if(dividend < 0 && divisor < 0) sign = false;   
        else if(dividend < 0 || divisor < 0) sign = true;

        long n = Math.abs((long)dividend);  // n = 43
        long d = Math.abs((long)divisor);   // d = 3

        long ans = 0;

        while(n >= d){
            // Iteration 1:
            // n = 43

            long count = 0;

            // Find largest count such that d * 2^(count+1) <= n
            // Try:
            // 3 * 2 = 6
            // 3 * 4 = 12
            // 3 * 8 = 24
            // 3 * 16 = 48 ❌ (too big)
            // So count = 3 (because 3 * 8 = 24)

            while(n > (d << (count+1))){
                count++;
            }

            // Add 2^count to answer
            // ans += 2^3 = 8
            ans += (1L << count);   // ans = 8

            // Subtract chunk
            // n -= 3 * 8 = 24
            n -= (d * (1L << count));  // n = 43 - 24 = 19

            // ----------------------------

            // Iteration 2:
            // n = 19

            // Try:
            // 3 * 2 = 6
            // 3 * 4 = 12
            // 3 * 8 = 24 ❌
            // So count = 2

            // ans += 4 → ans = 12
            // n -= 12 → n = 7

            // ----------------------------

            // Iteration 3:
            // n = 7

            // Try:
            // 3 * 2 = 6
            // 3 * 4 = 12 ❌
            // So count = 1

            // ans += 2 → ans = 14
            // n -= 6 → n = 1

            // ----------------------------

            // Now:
            // n = 1 < d = 3 → loop stops
        }

        // Final:
        // ans = 14 ✅

        if(ans > Integer.MAX_VALUE && sign) return Integer.MIN_VALUE;
        if(ans > Integer.MAX_VALUE && !sign) return Integer.MAX_VALUE;

        return sign ? -1 * (int)ans : (int)ans;
    }
}