class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int a : nums)
        {
            sum+=a;
        }
        int x = (n*(n+1))/ 2;
        return x-sum;
    }
}