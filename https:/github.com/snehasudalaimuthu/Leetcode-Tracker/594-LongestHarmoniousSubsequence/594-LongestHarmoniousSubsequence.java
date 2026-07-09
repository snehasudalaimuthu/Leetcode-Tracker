// Last updated: 09/07/2026, 10:04:13


class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int max = 0;
        int prevCount = 0;
        int currCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currCount++;
            } else if (nums[i] == nums[i - 1] + 1) {
                prevCount = currCount;
                currCount = 1;
            } else {
                prevCount = 0;
                currCount = 1;
            }

            if (prevCount > 0) {
                max = Math.max(max, prevCount + currCount);
            }
        }

        return max;
    }
}