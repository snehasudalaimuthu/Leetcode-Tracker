// Last updated: 09/07/2026, 11:17:36
class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}