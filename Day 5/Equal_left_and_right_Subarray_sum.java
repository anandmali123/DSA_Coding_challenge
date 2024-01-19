
class Solution {
    int equalSum(int[] A, int N) {
        // Write your code here
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        int leftsum = 0;
        for (int i = 0; i < A.length; i++) {
            if (leftsum == sum - A[i] - leftsum)
                return i + 1;
            leftsum += A[i];
        }
        return -1;
    }
}