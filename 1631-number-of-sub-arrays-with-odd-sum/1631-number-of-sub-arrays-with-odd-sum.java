class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int even=0;
        int odd=0;
        long res=0,sum=0;
        for(int num: arr)
        {
            sum+=num;
            if(sum%2==1)
            {
                odd++;
                res+=even+1;
            }
            else{
                even++;
                res+=odd;
            }
        }
        return (int) (res % mod);
    }
}