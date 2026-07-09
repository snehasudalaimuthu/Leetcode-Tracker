// Last updated: 09/07/2026, 09:46:43
class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int m = grid.size();
        int n = grid.get(0).size();

        int[][] maxHealth = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(maxHealth[i], -1);
        }

        int startHealth = health;
        if (grid.get(0).get(0) == 1) {
            startHealth--;
        }

        if (startHealth <= 0) {
            return false;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, startHealth});
        maxHealth[0][0] = startHealth;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            int row = curr[0];
            int col = curr[1];
            int currHealth = curr[2];

            if (row == m - 1 && col == n - 1) {
                return true;
            }

            for (int i = 0; i < 4; i++) {

                int newRow = row + dr[i];
                int newCol = col + dc[i];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {

                    int newHealth = currHealth;

                    if (grid.get(newRow).get(newCol) == 1) {
                        newHealth--;
                    }

                    if (newHealth > 0 && newHealth > maxHealth[newRow][newCol]) {

                        maxHealth[newRow][newCol] = newHealth;
                        queue.offer(new int[]{newRow, newCol, newHealth});
                    }
                }
            }
        }

        return false;
    }
}