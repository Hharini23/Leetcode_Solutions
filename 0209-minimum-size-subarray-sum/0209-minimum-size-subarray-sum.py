class Solution(object):
    def minSubArrayLen(self, target, nums):
            left=0
            right=0
            mini=[]
            subsum=0
            while right < len(nums):
               subsum+= nums[right]
               while subsum >= target:
                mini.append(right-left+1)
                subsum-=nums[left]
                left+=1
                  
               right+=1
            
            return 0 if len(mini) ==0 else min(mini)
        
# class Solution(object):
#     def minSubArrayLen(self, target, nums):
#         left = 0
#         right = 0
#         mini = []
#         subsum = 0

#         while right < len(nums):
#             subsum += nums[right]

#             while subsum >= target:
#                 mini.append(right - left + 1)
#                 subsum -= nums[left]
#                 left += 1  # Move the left pointer

#             right += 1  # Move the right pointer
        
#         return 0 if len(mini) == 0 else min(mini)