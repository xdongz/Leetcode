# Definition for singly-linked list.
#class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        def transferNode(Node):
            cur = 0
            i = 0
            if Node is None:
                return 0
            while Node is not None:
                cur = Node.val*(10**i)+cur
                Node = Node.next
                i = i+1
            return cur
        def transfernum(n):
            if n<10:
                return ListNode(n%10)
            while n>=10:
                node = ListNode(n%10)
                node.next = transfernum(n/10)
                n = n/10
                return node
            
        cur1 = transferNode(l1)
        cur2 = transferNode(l2)
        num = cur1+cur2
        return transfernum(num)
        
