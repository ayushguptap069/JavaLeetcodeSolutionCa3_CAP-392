/*
 * Q.NO: 6
 * Question: To Lower Case
 * LeetCode ID: 709
 * Problem Link: https://leetcode.com/problems/to-lower-case/
 *
 * Solution:
 */

class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
            result.append(ch);
        }
        return result.toString();
    }
}
