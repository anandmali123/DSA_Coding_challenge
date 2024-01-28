class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        int i = 0;
        int ans[] = new int[set.size()];
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            ans[i++] = itr.next();

        }
        return ans;
    }
}