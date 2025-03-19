class Solution(object):
    def minOperations(self, nums):
        c=0
        l=len(nums)
        i=0
        while i < l-2 :
            if(nums[i]==0):
                c=c+1
                for j in range(i,i+3):
                    if(nums[j]==0):
                        nums[j]=1
                    else:
                        nums[j]=0
            i=i+1
        if 0 in nums[l-2:]:
            return -1
        return c
        