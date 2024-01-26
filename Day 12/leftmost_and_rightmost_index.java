
class Solution {

    // Function for finding maximum and value pair
    public static long find_multiplication(int A[], int B[], int n, int m) {
        // Complete the Function
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < B.length; j++) {
            if (B[j] < min)
                min = B[j];
        }
        return min * max;

    }

}
