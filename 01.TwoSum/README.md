# 题目
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,

return [0, 1].
# 思路
编程小白的第一个想法自然就是遍历，相加，判断其和是不是等于target

于是，用了两个for循环，但是很明显不是最优解

看到discuss中排名前面的解法，都是用上了dictionary。把nums中的index作为value存放在dict中，把nums中的value
作为key存放在dict中。
