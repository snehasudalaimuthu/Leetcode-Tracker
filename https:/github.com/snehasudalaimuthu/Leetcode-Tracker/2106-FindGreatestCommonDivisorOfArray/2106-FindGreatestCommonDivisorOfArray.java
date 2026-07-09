// Last updated: 09/07/2026, 10:03:29
class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        while(max%min!=0){
            int rem=max%min;
            max=min;
            min=rem;
        }
        return min;
    }
}