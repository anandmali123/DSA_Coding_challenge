import java.util.*;

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        // Priority queue to store points based on their y-x value
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - b[0] - (a[1] - a[0]));

        int ans = Integer.MIN_VALUE;

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            // Remove points that are out of range
            while (!pq.isEmpty() && x - pq.peek()[0] > k) {
                pq.poll();
            }

            if (!pq.isEmpty()) {
                int[] prevPoint = pq.peek();
                ans = Math.max(ans, y + x + prevPoint[1] - prevPoint[0]);
            }

            // Add current point to the priority queue
            pq.offer(point);
        }

        return ans;
    }
}
