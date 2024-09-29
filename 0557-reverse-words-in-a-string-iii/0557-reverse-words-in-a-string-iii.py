class Solution(object):
    def reverseWords(self, s):
        word = split(s[::-1],' ')
        return " ".join(word[::-1])
        