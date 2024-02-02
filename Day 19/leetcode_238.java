class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int countofnull = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                countofnull++;
            else {
                product *= nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (countofnull == 0) {
                nums[i] = product / nums[i];
            } else if (countofnull == 1) {
                if (nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }

            } else {
                nums[i] = 0;
            }
        }
        return nums;
    }
}