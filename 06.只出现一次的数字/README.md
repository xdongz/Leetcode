# 题目描述：
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:

输入: [2,2,1]
输出: 1
示例 2:

输入: [4,1,2,1,2]
输出: 4

# 解题思路
## 1.排序法后遍历
看到题目首先想到的是遍历，但是暴力遍历很容易考虑不到所有的情况。所以可以先排序，比较相邻的数字是否相同，如果相同就往后移两位再比较，如果不相同就直接return。

## 2.异或
对于这种成对出现的数字，应该要先想到异或。异或的特性是：
a^0=a;
a^a=0;
a^b^a=b;
但是如果是同样的数字出现了三次，可能需要用到方法1

