/*class Solution {
    public int waysToSplitArray(int[] nums) {
        int left=0,right=0,validsplit=0;
        for(int num : nums)
        {
           right+=num;
        }
        for(int i=0;i<nums.length-1;i++)
        {
           left+=nums[i];
           right-=nums[i];
           if(left >= right)
           {
             validsplit++;
           }
        }
        return validsplit;
    }
}*/
class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int validSplits = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            if (leftSum >= rightSum) {
                validSplits++;
            }
        }

        return validSplits;
    }
}