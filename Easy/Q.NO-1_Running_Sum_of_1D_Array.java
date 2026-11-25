/*
 * Q.NO: 1
 * Question: Running Sum of 1D Array
 * LeetCode ID: 1480
 * Problem Link: https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * Solution:
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
