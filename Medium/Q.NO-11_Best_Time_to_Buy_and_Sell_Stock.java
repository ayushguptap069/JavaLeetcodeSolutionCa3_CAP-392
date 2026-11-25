/*
 * Q.NO: 11
 * Question: Best Time to Buy and Sell Stock
 * LeetCode ID: 121
 * Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Solution:
 */

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) minPrice = prices[i];
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) maxProfit = profit;
        }
        return maxProfit;
    }
}
