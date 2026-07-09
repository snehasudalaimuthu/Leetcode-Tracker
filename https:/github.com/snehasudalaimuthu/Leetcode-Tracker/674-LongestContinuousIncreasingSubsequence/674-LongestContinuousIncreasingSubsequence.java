// Last updated: 09/07/2026, 10:04:03
class Solution {
    public int findLengthOfLCIS(int[] nums) {
      int n=nums.length;
        if(n == 1)
            return 1;
        int count = 0;int c=1;
        for (int i = 1; i < n; i++) {

            if (nums[i] > nums[i-1] ) {
                c++;
            }
            else{
                c=1;
            }
            if (c > count) {
                count = c;
            }
        }
        return count;
    }
}