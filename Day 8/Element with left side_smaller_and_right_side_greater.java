
class Compute {
    public int findElement(int arr[], int n) {
        for (int i = 1; i < arr.length - 1; i++) {
            int num = arr[i];
            int j = 0;
            int k = arr.length - 1;
            int flag = 0;
            int hlag = 0;
            while (j < i) {
                if (arr[j] > arr[i]) {
                    flag = 1;
                    break;
                }
                j++;
            }
            while (k > i) {
                if (arr[k] < arr[i]) {
                    hlag = 1;
                    break;
                }
                k--;
            }
            if (flag == 0 && hlag == 0) {
                return arr[i];
            }
        }
        return -1;
    }
}