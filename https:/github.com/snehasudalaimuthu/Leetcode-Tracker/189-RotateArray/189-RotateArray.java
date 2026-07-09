// Last updated: 09/07/2026, 11:18:30
class Solution {
    public void rotate(int[] nums, int k) {
        //LOGIC: to understand logic of code, DRY run karoo !!
        
        int n= nums.length;
        k= k%n;

        //reverse whole array
        reverse(nums, 0, n-1);

        //reverse first k elements
        reverse(nums, 0, k-1);

        //reverse rest of the elements
        reverse(nums, k, n-1);

    }

    static void reverse(int[] nums, int s, int e){
        //s is start pointer 
        //e is end pointer
        while(s<e){
            int temp=nums[s];
            nums[s]= nums[e];
            nums[e]= temp;
            s++; e--;
        }
    }
}