// Last updated: 09/07/2026, 10:04:48
class Solution {
    public char findTheDifference(String s, String t) {
       char ch=0;
       for(int i=0;i<s.length();i++){
        ch^=s.charAt(i);
       }
       for(int j=0;j<t.length();j++){
        ch^=t.charAt(j);
       }
       return ch;
    }
}