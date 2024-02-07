/*
    Time Complexity: O( N * M * log(M) )
    Space Complexity: O( M )
	
     where 'N' is the total number of elements and 'M' is size of subarray for which you need to find median.
*/

import java.util.*;

public class Solution {
    public static ArrayList<Double> findMedian(ArrayList<Integer> arr, int n, int m) {
        ArrayList<Double> ans = new ArrayList<Double>();
        for (int i = 0; i + m - 1 < n; i++) {
            ArrayList<Integer> v = new ArrayList<Integer>();

            for (int j = i; j < i + m; j++) {
                v.add(arr.get(j));
            }

            Collections.sort(v);

            double median;
            if (m % 2 == 1) {
                median = v.get(m / 2);
            } else {
                median = ((double) v.get(m / 2 - 1) + v.get(m / 2)) / 2.0;
            }
            ans.add(median);
        }

        return ans;
    }
}