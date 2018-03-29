class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        s = str(abs(x))
        s = int(s[::-1])
        if s.bit_length()>=32:
            return 0
        else:
            return cmp(x,0)*s
        
