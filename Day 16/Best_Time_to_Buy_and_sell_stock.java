class Solution {
    public int maxProfit(int[] prices) {
        int op = Integer.MIN_VALUE;
        int lsf = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            int diff = prices[i] - lsf;
            if (op < diff) {
                op = diff;
            }
        }
        return op;
    }
}