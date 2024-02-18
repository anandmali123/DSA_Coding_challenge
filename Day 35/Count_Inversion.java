class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], long N) {
        return mergeSortAndCount(arr, 0, N - 1);
    }

    static long mergeSortAndCount(long arr[], long l, long r) {
        long count = 0;
        if (l < r) {
            long m = (l + r) / 2;

            // Count inversions in the left half and right half.
            count += mergeSortAndCount(arr, l, m);
            count += mergeSortAndCount(arr, m + 1, r);

            // Count inversions across the split halves.
            count += merge(arr, l, m, r);
        }
        return count;
    }

    static long merge(long arr[], long l, long m, long r) {
        long[] left = Arrays.copyOfRange(arr, (int) l, (int) (m + 1));
        long[] right = Arrays.copyOfRange(arr, (int) (m + 1), (int) (r + 1));

        long i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[(int) i] <= right[(int) j]) {
                arr[(int) k++] = left[(int) i++];
            } else {
                arr[(int) k++] = right[(int) j++];
                swaps += (m + 1) - (l + i);
            }
        }

        while (i < left.length) {
            arr[(int) k++] = left[(int) i++];
        }

        while (j < right.length) {
            arr[(int) k++] = right[(int) j++];
        }

        return swaps;
    }
}
