import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int s = 0;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (set.contains(x)) {
                arr[0] = i;
                s = x;
                break;
            }
            set.add(nums[i]);

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == s) {
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}