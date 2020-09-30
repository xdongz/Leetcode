class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0, j=1; j<nums.length; i=i+2, j=j+2) {
            if (nums[i]!=nums[j]) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}