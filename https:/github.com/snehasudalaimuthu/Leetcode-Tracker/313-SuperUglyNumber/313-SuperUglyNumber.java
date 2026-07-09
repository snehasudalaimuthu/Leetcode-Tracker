// Last updated: 09/07/2026, 10:04:59
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {

        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        long[] val = new long[primes.length];

        Arrays.fill(val, 1);

        int next = 1;

        for (int i = 0; i < n; i++) {
            ugly[i] = next;

            long min = Long.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                if (val[j] == ugly[i]) {
                    val[j] = (long) ugly[idx[j]++] * primes[j];
                }
                min = Math.min(min, val[j]);
            }

            next = (int) min;
        }

        return ugly[n - 1];
    }
}