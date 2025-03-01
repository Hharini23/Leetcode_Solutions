class Solution {
    public int[] applyOperations(int[] nums) {
        int n= nums.length;
        int[] mod= new int [n];
        int zer=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i] == nums[i+1]  && nums[i]!=0)
            {
              nums[i]= nums[i]*2;
              nums[i+1]=0;
            }
        }
        for(int num : nums)
        {
            if(num!=0)
            {
                mod[zer++]=num;
            }
        }
        while(zer < n)
        {
            mod[zer++]=0;
        }
      return mod;
    }
}