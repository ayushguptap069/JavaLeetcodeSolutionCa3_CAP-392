/*
 * Q.NO: 10
 * Question: Two Sum
 * LeetCode ID: 1
 * Problem Link: https://leetcode.com/problems/two-sum/
 *
 * Solution:
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}
