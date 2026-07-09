// Last updated: 09/07/2026, 09:47:10
class Solution {
    public int bitwiseComplement(int n) {
        String b = Integer.toBinaryString(n);
        String result = "";

        for (char c : b.toCharArray()) {
            if (c == '0') {
                result += '1';
            } else {
                result += '0';
            }
        }

        return Integer.parseInt(result, 2);
    }
}