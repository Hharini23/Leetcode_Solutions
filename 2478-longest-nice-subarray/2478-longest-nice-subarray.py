class Solution(object):
    def longestNiceSubarray(self, nums):
        l=0
        used=0
        maxlen=0
        for r in range (len(nums)):
            while used & nums[r] !=0 :
                used^=nums[l]
                l+=1
            used|=nums[r]
            maxlen = max(maxlen, r-l+1)
        return maxlen
             
              

        