
//User function Template for Java
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each element in the array
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }

        int count = 0;

        // Iterate through the array to find pairs
        for (int i = 0; i < n; i++) {
            int x = k - arr[i];

            // Check if there is a pair with sum equal to K
            if (map.containsKey(x)) {
                count += map.get(x);

                // If x is the same as arr[i], decrement count
                if (x == arr[i])
                    count--;
            }
        }

        // Divide by 2 as each pair is counted twice
        return count / 2;
    }
}
