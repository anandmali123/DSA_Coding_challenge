
// User function Template for Java
import java.util.*;
class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                set.add(map.get(arr[i]));

            } else
                map.put(arr[i], i);
        }

        if (set.size() != 0) {
            List<Integer> ans = new ArrayList<>(set);
            Collections.sort(ans);
            // System.out.println(ans);
            return ans.get(0) + 1;

        }

        return -1;
    }
}