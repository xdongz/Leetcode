#!python

class Solution:
    def twoSum(self, nums, target):
        d = {}
        for i, n in enumerate(nums):
            m = target-n
            if m in d:
                return [d[m],i]
            else:
                d[n] = i

if __name__ == "__main__":
    nums = [2,7,11,15]
    target = 9
    solution = Solution()
    print(solution.twoSum(nums,target))
