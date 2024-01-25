class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int result[][];
        result = new int[m][n];
        if (original.length != m * n) {
            return new int[0][0];
        }
        int k = 0;
        int totalElements = original.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[k];
                k++;
            }
        }

        return result;
    }
};