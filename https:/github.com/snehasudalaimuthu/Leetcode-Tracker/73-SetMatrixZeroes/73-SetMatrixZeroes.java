// Last updated: 09/07/2026, 11:19:46
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean cContainsZeros = false;
        boolean rContainsZeros = false;
        for(int c = 0; c < matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                cContainsZeros = true;
                break;
            }
        }
        for(int r = 0; r < matrix.length; r++) {
            if (matrix[r][0] == 0) {
                rContainsZeros = true;
                break;
            }
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if(matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    matrix[r][0] = 0; 
                }
            }
        }
        for(int r = 1; r < matrix.length; r++) {
            if(matrix[r][0] == 0) {
                for(int c = 1; c < matrix[0].length; c++) {
                    matrix[r][c] = 0;
                }
            }
        }
        for (int c = 1; c < matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                for (int r = 1; r < matrix.length; r++) {
                    matrix[r][c] = 0;
                }
            }
        }
        if (cContainsZeros) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[0][c] = 0;
            }
        }
        if (rContainsZeros) {
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][0] = 0;
            }
        }        
    }
}
