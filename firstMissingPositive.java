public class firstMissingPositive {
    public int firstMissingPositive(int[] arr) {
        int size = arr.length;
        for (int k = 0; k < size; k++) {
            while (arr[k] > 0 && arr[k] <= size && arr[arr[k] - 1] != arr[k]) {
                int val = arr[arr[k] - 1];
                arr[arr[k] - 1] = arr[k];
                arr[k] = val;
            }
        }
        for (int k = 0; k < size; k++) {
            if (arr[k] != k + 1) {
                return k + 1;
            }
        }
        return size + 1;
    }
}
