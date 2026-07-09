// Last updated: 09/07/2026, 10:04:54
class Solution {
    public String reverseVowels(String s) {
    char[] ch=s.toCharArray();
    int i=0;
    int j=ch.length-1;
     while(i<j){
        while(i<j && "aeiouAEIOU".indexOf(ch[i])==-1){
            i++;
        }
        while(i<j && "aeiouAEIOU".indexOf(ch[j])==-1){
            j--;
        }
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        i++;
        j--;
     }
     return new String(ch); 
    }
}