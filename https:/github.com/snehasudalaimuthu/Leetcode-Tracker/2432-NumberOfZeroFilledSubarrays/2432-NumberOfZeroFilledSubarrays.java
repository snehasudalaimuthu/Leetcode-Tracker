// Last updated: 09/07/2026, 09:46:53
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                    count++;
                    result=result+count;
                }
                else{
                    count=0;
                }
            }
        return result;
    }
}