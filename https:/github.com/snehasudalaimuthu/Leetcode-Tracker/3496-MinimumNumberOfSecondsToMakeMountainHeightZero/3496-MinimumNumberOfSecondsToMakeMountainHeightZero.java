// Last updated: 09/07/2026, 09:46:45
class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 1;
        long right = (long)1e16;

        while (left < right) {
            long mid = left + (right - left) / 2;

            if (canReduce(mountainHeight, workerTimes, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canReduce(int height, int[] workerTimes, long time) {
        long total = 0;

        for (int wt : workerTimes) {
            long x = (long)((Math.sqrt(1 + 8.0 * time / wt) - 1) / 2);
            total += x;

            if (total >= height) return true;
        }

        return false;
    }
}