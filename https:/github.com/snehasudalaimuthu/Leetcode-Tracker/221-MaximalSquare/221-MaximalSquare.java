// Last updated: 09/07/2026, 11:17:54
class Solution {
    public int maximalSquare(char[][] mat){
        int n = mat.length,m = mat[0].length,arr[] = new int[m],maxArea = 0;
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(arr,1);
            for(int j = i ; j < n ; j++){
                addRowToArray(arr,m,mat[j]);
                if(maxContigiousOnes(arr,m,j - i + 1)){
                    maxArea = Math.max(maxArea, (j - i + 1) * (j - i + 1));
                }      
            }
        }
        return maxArea;
    }
    private static void addRowToArray(int[]arr,int n,char temp[]){
        for(int i = 0 ; i < n ; i++){
            int num = temp[i] - '0';
            arr[i] &= num;
        }
    }
    private static boolean maxContigiousOnes(int[]arr,int n,int length){
        int left = 0,right = 0;
        while(right < n && left < n){
            while(right < n && arr[right] != 1){
                left = ++right;
            }
            if(right < n){ 
                if(right - left + 1 == length)
                    return true;
            }
            right++;
        }
        return false;
    }
    private static void addRowToArray(int[]arr,int n,int temp[]){
        for(int i = 0 ; i < n ; i++){
            arr[i] &= temp[i];
        }
    }
}