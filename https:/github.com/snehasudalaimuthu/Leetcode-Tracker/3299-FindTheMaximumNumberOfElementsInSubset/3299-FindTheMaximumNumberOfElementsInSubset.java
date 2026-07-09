// Last updated: 09/07/2026, 09:46:48
import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        if (map.containsKey(1L)) {
            int cnt = map.get(1L);
            ans = Math.max(ans, (cnt % 2 == 0) ? cnt - 1 : cnt);
        }

        for (long start : map.keySet()) {

            if (start == 1L) {
                continue;
            }

            long cur = start;

            int len = 0;

            while (true) {

                int cnt = map.getOrDefault(cur, 0);

                if (cnt == 0) {
                    break;
                }

                if (cnt == 1) {
                    len++;
                    break;
                }

                len += 2;

                if (cur > 1000000000L / cur) {
                    break;
                }

                cur = cur * cur;
            }

            if (len % 2 == 0) {
                len--;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}