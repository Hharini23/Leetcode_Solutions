class Solution {
    public int maxAscendingSum(int[] nums) {
        int cur= nums[0];
        int ans=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i] > nums[i-1])
            {
                cur+=nums[i];
            }
            else{
                cur=nums[i];
            }
            ans=Math.max(ans,cur);
        }
        return ans;
    }
}
