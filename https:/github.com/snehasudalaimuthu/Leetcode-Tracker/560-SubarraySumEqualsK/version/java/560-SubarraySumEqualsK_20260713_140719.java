// Last updated: 13/07/2026, 14:07:19
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n=nums.length;
4        int count=0;
5        for(int i=0;i<n;i++){
6            int sum=0;
7            for(int j=i;j<n;j++){
8                sum=sum+nums[j];
9                if(sum==k){
10                    count++;
11                }
12            }
13        }
14        return count;
15    }
16}