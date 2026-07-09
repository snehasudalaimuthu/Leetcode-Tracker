// Last updated: 09/07/2026, 11:19:00
class Solution {
    public int singleNumber(int[] nums) {
       for(int i=0;i<nums.length;i++){
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
        }
        if(count==1){
            return nums[i];
        }
       }
       return -1;
    }
}