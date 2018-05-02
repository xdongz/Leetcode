#Python3

class Solution:
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dict={'M':1000,'D':500,'C':100,'L':50,'X':10,'V':5,'I':1,'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
        i=0
        sum=0
        while i<len(s):
            if s[i:i+2] in dict:
                sum = sum + dict[s[i:i+2]]
                i=i+2
            elif s[i] in dict:
                sum = sum +dict[s[i]]
                i=i+1
        return sum
