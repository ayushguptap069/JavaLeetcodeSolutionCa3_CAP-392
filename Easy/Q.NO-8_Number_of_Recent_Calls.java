/*
 * Q.NO: 8
 * Question: Number of Recent Calls
 * LeetCode ID: 933
 * Problem Link: https://leetcode.com/problems/number-of-recent-calls/
 *
 * Solution:
 */

import java.util.LinkedList;
import java.util.Queue;
class RecentCounter {
    private Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) queue.remove();
        return queue.size();
    }
}
