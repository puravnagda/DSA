class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0, end = nums.length - 1;
        for (int p = nums.length-1; p >= 0; p--) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[p] = nums[start] * nums[start];
                start++;
            } else {
                result[p] = nums[end] * nums[end];
                end--;
            }
        }
        return result;
    }
}