class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,m=0;
        int h= nums.length-1;
        while(m<=h)
        {
            if(nums[m]!=0)
            {
               int temp=nums[m];
               nums[m]=nums[l];
               nums[l]=temp;
               l++;
            }
            m++;
        }
        return ;
    }
}