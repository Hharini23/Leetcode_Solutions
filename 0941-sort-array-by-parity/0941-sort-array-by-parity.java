class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int num:nums)
        {
            if(num%2==0)
            {
                arr[i++]=num;
            }
            else{
                arr[j--]=num;
            }
            
        }
        return arr;
    }
}
