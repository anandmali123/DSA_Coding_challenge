import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int l = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = l;
                count++;
            }

        }

        Arrays.sort(nums);
        return nums.length - count;
    }
}