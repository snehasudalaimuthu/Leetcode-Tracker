// Last updated: 7/15/2026, 12:04:24 PM
1class Solution {
2    public int countEven(int num) {
3      int count=0;
4      for(int i=1;i<=num;i++){
5        int sum=0;
6        int temp=i;
7        while(temp>0){
8            sum=sum+temp%10;
9            temp=temp/10;
10        }
11        if(sum%2==0){
12            count++;
13        }
14      }
15      return count;
16    }
17}