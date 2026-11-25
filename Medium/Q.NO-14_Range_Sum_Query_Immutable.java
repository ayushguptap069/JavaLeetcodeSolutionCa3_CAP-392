/*
 * Q.NO: 14
 * Question: Range Sum Query - Immutable
 * LeetCode ID: 303
 * Problem Link: https://leetcode.com/problems/range-sum-query-immutable/
 *
 * Solution:
 */

class NumArray {
    private int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
