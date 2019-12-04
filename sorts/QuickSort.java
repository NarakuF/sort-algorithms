package sorts;

import java.util.Arrays;

import utils.*;


public class QuickSort implements Sort {

    public void sort(int[] arr) {
        doSort(arr, 0, arr.length - 1);
    }

    private void doSort(int[] arr, int lo, int hi) {
        if (lo >= hi)
            return;

        int first = lo;
        int last = hi;
        int key = arr[first];

        while (first < last) {
            while (first < last && arr[last] >= key)
                last--;
            arr[first] = arr[last];
            while (first < last && arr[first] <= key)
                first++;
            arr[last] = arr[first];
        }
        arr[first] = key;
        doSort(arr, lo, first - 1);
        doSort(arr, first + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 2, 3, 6, 1};
        System.out.println(Arrays.toString(arr));

        Sort s = new QuickSort();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
