// Last updated: 09/07/2026, 11:21:21
class Solution {
    public static int reverse(int n) {
        int originalN = n;
        long rev = 0;
        while( n != 0 ){
            int x = n%10;
            // System.out.print(-x);
            rev = (rev*10) + x;
            n = n/10;
            
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        else
            return (int) rev;
    }
}