#题目

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 
32-bit signed integer range. For the purpose of this problem, assume that your function 
returns 0 when the reversed integer overflows.

#思路

1.第一种思路是除10，求余。要注意的是0在末尾和中间的情况，还有边界溢出的情况，以及是负数的情况

2.第二种思路是把int数转换成字符串，通过字符串的内置函数来转换
