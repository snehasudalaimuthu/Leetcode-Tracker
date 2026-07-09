// Last updated: 09/07/2026, 11:17:27
public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h_index = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > h_index)
                h_index++;
            else
                break;
        }
        return h_index;
    }
}