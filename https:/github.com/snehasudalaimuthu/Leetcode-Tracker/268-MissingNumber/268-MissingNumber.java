// Last updated: 09/07/2026, 11:17:26
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return (n*(n+1)/2)-sum;
    }
}