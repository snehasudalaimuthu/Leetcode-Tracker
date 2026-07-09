// Last updated: 09/07/2026, 11:20:28
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),res,0);
        return res;
    }
    public void backtrack(int[] candidate,int target,int start,List<Integer>curr,List<List<Integer>> res,int sum){
        if(sum==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(sum>target) return;

        for(int i=start;i<candidate.length;i++){
            curr.add(candidate[i]);
            backtrack(candidate,target,i,curr,res,sum+candidate[i]);
            curr.remove(curr.size()-1);
        }
    }
}