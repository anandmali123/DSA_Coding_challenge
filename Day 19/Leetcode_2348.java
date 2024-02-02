class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int len0 = 0, sum = 0;
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum != 0) {
                sum = 0;
                len0 = 0;
                continue;

            }
            len0++;
            count += len0;
        }
        return count;
    }
}