s = [1,2,2]
index = 2
while len(s) < 100000:
	# according to the last element, we decide the value of 'val'
	val = 3 - s[-1]
	s.extend([val]*s[index])
	index += 1

class Solution(object):
    def magicalString(self, n):
       
        return s[:n].count(1)
