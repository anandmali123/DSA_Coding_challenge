
class Solution {
    int minDist(int a[], int n, int x, int y) {
        int ans = Integer.MAX_VALUE;
        // code here
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                int p = i + 1;
                int count = 1;
                while (p < n) {
                    if (a[p++] != y) {
                        count++;
                    } else {
                        ans = Math.min(count, ans);
                        break;
                        // return count;
                    }
                }
            }
            if (a[i] == y) {
                int p = i + 1;
                int count = 1;
                while (p < n) {
                    if (a[p++] != x) {
                        count++;
                    } else {
                        ans = Math.min(count, ans);
                        // return count;
                        break;
                    }
                }

            }
        }

        if (ans != Integer.MAX_VALUE)
            return ans;

        return -1;
    }
}