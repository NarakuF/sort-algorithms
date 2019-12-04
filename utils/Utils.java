package utils;


public class Utils {

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void merge(int[] arr, int str, int mid, int end, int[] tmp) {
        int i = str;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                tmp[k] = arr[i];
                k++;
                i++;
            } else {
                tmp[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            tmp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= end) {
            tmp[k] = arr[j];
            k++;
            j++;
        }
        /*
        for (int m = 0; m < k; m++)
            arr[str + m] = tmp[m];
        */
        if (k >= 0) System.arraycopy(tmp, 0, arr, str, k);
    }
}
