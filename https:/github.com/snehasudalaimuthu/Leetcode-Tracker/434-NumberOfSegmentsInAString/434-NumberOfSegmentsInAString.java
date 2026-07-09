// Last updated: 09/07/2026, 10:04:37
class Solution {
    public int countSegments(String s) {

        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) != ' ' &&
               (i == 0 || s.charAt(i - 1) == ' ')) {

                count++;
            }
        }

        return count;
    }
}