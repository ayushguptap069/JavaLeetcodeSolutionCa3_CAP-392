/*
 * Q.NO: 4
 * Question: Reverse String
 * LeetCode ID: 344
 * Problem Link: https://leetcode.com/problems/reverse-string/
 *
 * Solution:
 */

class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
