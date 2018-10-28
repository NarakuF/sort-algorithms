import java.util.Arrays;

public class Algorithm {
    public static void insert_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                }
                else {
                    break;
                }
            }
        }
    }

    public static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                swap(arr, i, minIdx);
            }
        }
    }

    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void quick_sort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int first = lo;
        int last = hi;
        int key = arr[first];

        while (first < last) {
            while (first < last && arr[last] >= key) {
                last--;
            }
            arr[first] = arr[last];
            while (first < last && arr[first] <= key) {
                first++;
            }
            arr[last] = arr[first];
        }
        arr[first] = key;
        quick_sort(arr, lo, first - 1);
        quick_sort(arr, first + 1, hi);
    }

    public static void merge(int[] arr, int str, int mid, int end, int[] tmp) {
        int i = str;
        int j = mid +1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                tmp[k] = arr[i];
                k++;
                i++;
            }
            else {
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
        for (int m = 0; m < k; m++) {
            arr[str + m] = tmp[m];
        }
    }

    public static void merge_sort(int[] arr, int str, int end, int[] tmp) {
        if (str < end) {
            int mid = (str + end) / 2;
            merge_sort(arr, str, mid, tmp);
            merge_sort(arr, mid + 1, end, tmp);
            merge(arr, str, mid, end, tmp);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 2, 3, 6, 1};
        // Algorithm.insert_sort(arr);
        // Algorithm.selection_sort(arr);
        // Algorithm.bubble_sort(arr);
        // Algorithm.quick_sort(arr, 0, arr.length - 1);
        Algorithm.merge_sort(arr, 0, arr.length - 1, new int[arr.length]);
        System.out.println(Arrays.toString(arr));
    }
}
