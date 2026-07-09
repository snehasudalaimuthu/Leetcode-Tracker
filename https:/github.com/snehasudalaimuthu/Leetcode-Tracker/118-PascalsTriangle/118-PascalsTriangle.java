// Last updated: 09/07/2026, 11:19:17
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> r = new ArrayList<>();
            int curr = 1;
            for(int j = 0; j <= i; j++){
                r.add(curr);
                curr = curr * (i - j) / (j + 1);
            }
            res.add(r);
        }
        return res;
    }
}