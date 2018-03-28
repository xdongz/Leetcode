class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if (x < -2147483648 or x > 2147483647):
            return 0
        s = 0
        if abs(x)/10 == 0:
            return x
        if (x>0):
            flag = 1
        else:
            flag = -1
        x = abs(x)
        n = x%10
        while (n==0):
            x = x/10
            n = x%10
        while (x!=0):
            a = x%10
            s = s*10+a
            x = x/10
        if (s < -2147483648 or s > 2147483647):
            return 0
        if flag==1:
            return s
        else:
            return -s
