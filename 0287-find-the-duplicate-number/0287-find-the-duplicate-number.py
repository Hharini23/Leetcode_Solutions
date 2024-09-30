class Solution(object):
    def findDuplicate(self, nums):
       l=set()
       for i in nums:
         if i in l:
            return i
         l.add(i)
        