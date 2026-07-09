// Last updated: 09/07/2026, 09:46:32
import java.util.*;

class Solution {

    private String s;
    private HashMap<String, long[]> memo;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long n) {
        if (n <= 0) return 0;

        s = String.valueOf(n);
        memo = new HashMap<>();

        long[] res = dfs(0, -1, -1, true, false);
        return res[1];
    }

    private long[] dfs(int pos, int prev2, int prev1,
                       boolean tight, boolean started) {

        if (pos == s.length()) {
            return new long[]{1, 0};
        }

        String key = pos + "," + prev2 + "," + prev1 + ","
                + tight + "," + started;

        if (!tight && memo.containsKey(key)) {
            return memo.get(key);
        }

        int limit = tight ? s.charAt(pos) - '0' : 9;

        long totalCount = 0;
        long totalWave = 0;

        for (int d = 0; d <= limit; d++) {

            boolean nextTight = tight && (d == limit);

            if (!started && d == 0) {

                long[] nxt = dfs(pos + 1, -1, -1,
                        nextTight, false);

                totalCount += nxt[0];
                totalWave += nxt[1];

            } else {

                long add = 0;

                if (prev2 != -1) {
                    if ((prev1 > prev2 && prev1 > d) ||
                        (prev1 < prev2 && prev1 < d)) {
                        add = 1;
                    }
                }

                long[] nxt = dfs(pos + 1,
                        prev1,
                        d,
                        nextTight,
                        true);

                totalCount += nxt[0];
                totalWave += nxt[1] + add * nxt[0];
            }
        }

        long[] ans = new long[]{totalCount, totalWave};

        if (!tight) {
            memo.put(key, ans);
        }

        return ans;
    }
}