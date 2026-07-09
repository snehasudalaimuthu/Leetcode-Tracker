// Last updated: 09/07/2026, 11:17:32
class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>=10)
        {
            sum=0;
            while(num>0)
            {
                int temp= num%10;
                sum=sum+temp;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}