// Last updated: 09/07/2026, 09:46:57
class Solution {
    public int countVowelSubstrings(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            int arr[]=new int[5];
            for(int j=i;j<word.length();j++){
                char ch=word.charAt(j);
            
            if(ch=='a')
            arr[0]++;
            else if(ch=='e')
            arr[1]++;
            else if(ch=='i')
            arr[2]++;
            else if(ch=='o')
            arr[3]++;
            else if(ch=='u')
            arr[4]++;
            else
                break;
            if(arr[0]> 0 && arr[1]>0 && arr[2]> 0 && arr[3]> 0 && arr[4]> 0){
                count++;
            }
        }
        }
        return count;
    }
}