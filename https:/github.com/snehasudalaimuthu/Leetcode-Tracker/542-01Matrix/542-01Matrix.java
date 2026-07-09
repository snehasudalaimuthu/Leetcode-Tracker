// Last updated: 09/07/2026, 10:04:19
import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[][] ans = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Initialize
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    ans[i][j] = -1; // Mark as unvisited
                }
            }
        }

        // Directions: up, down, left, right
        int[][] dir = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        // BFS
        while (!queue.isEmpty()) {

            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            for (int[] d : dir) {

                int newRow = row + d[0];
                int newCol = col + d[1];

                if (newRow >= 0 && newRow < m &&
                    newCol >= 0 && newCol < n &&
                    ans[newRow][newCol] == -1) {

                    ans[newRow][newCol] = ans[row][col] + 1;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }

        return ans;
    }
}