/*
 * Q.NO: 3
 * Question: Contains Duplicate
 * LeetCode ID: 217
 * Problem Link: https://leetcode.com/problems/contains-duplicate/
 *
 * Solution:
 */

import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
