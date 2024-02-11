
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];

        // Find the duplicate and missing elements
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (arr[val - 1] > 0) {
                arr[val - 1] = -arr[val - 1];
            } else {
                ans[0] = val;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[1] = i + 1;
                break;
            }
        }

        return ans;
    }
}
