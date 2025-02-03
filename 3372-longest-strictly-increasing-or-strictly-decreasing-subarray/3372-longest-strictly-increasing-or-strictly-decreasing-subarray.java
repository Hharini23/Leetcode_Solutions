class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n= nums.length;
        int res=1,inc=1,dcr=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i] > nums[i-1])
            {
               inc+=1;
               dcr=1;
            }
            else if(nums[i] < nums[i-1])
            {
               dcr+=1;
               inc=1;
            }
            else
            {
                inc=1;
                dcr=1;
            }
            res= Math.max(res, Math.max(inc,dcr));
        }
        return res;
    }
}