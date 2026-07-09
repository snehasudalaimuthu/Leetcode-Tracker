// Last updated: 09/07/2026, 10:03:34
class Solution {
    public boolean checkIfPangram(String sentence) {
       for(char ch = 'a'; ch <= 'z'; ch++) {
            if(sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true; 
    }
}