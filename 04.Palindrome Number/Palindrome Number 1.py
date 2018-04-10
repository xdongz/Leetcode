class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x<0:
            return False
        else:
            s = str(abs(x))
            s = int(s[::-1])
            s = cmp(x,0)*s
            if x==s:
                return True
            else:
                return False
