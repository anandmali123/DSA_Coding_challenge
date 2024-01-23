
class Solution {

    public static int longest(int nums[], int n) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max <= nums[i]) {
                max = nums[i];
                count++;
            }
        }
        return count;
    }
}