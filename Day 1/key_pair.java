
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = x - num;

            if (set.contains(complement)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
