class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int p = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    while (++j < nums2.length && nums2[j] <= nums1[i]);
                    
                    if (j < nums2.length) {
                        ans[p++] = nums2[j];
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                ans[p++] = -1;
            }
        }
        return ans;
    }
}
