// Last updated: 09/07/2026, 10:03:39
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum=sum+mat[i][i];
            sum=sum+mat[i][n-1-i];
        }
        if(n%2==1){
            sum=sum-mat[n/2][n/2];
        }
        return sum;
    }
}