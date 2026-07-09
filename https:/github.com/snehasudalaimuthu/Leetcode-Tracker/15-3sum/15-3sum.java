// Last updated: 09/07/2026, 11:21:08
class Solution {

    // i is fixed pointer 
    // j & k move and compute the target sum

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums) ; // will help in finding the remaining two sum faster 
        List<List<Integer>> ans = new ArrayList<>() ;
        for (int i = 0 ; i < nums.length - 1 ; i++ ){
            if(i > 0 && nums[i] == nums[i-1]) continue ;
            // if same number is repeated , its three sum elements
            // also be same so we ignore repeated values and move next
            int j = i+1 ; 
            // j always greater than one because array is sorted 
            // and we don't want duplicates , so everything previous
            // than i is already checked if it computes 3 sum 
            // so no need to check again 
            int k = nums.length -1 ; 
            while(j < k){
    
                if (nums[i] + nums[j] + nums[k] == 0){  // three sum found ;
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k])) ;
                    j++;
                    // if same number is repeated , its three sum elements
                    // also be same so we ignore repeated values and move next
                    while ( j < k 
                        && nums[j] == nums[j-1]) 
                    {

                        j++ ;
                    }
                    k--;
                    while ( j < k 
                        && k < nums.length - 1 
                        && nums[k] == nums[k+1]) 
                    {
                        k-- ;
                    }
                }
                else if (nums[i] + nums[j] + nums[k] < 0){
                    j++ ;
                }
                else {
                    k-- ;
                }
                
            }
            
        }
        return ans ;
    }
}