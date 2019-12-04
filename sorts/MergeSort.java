package sorts;

import java.util.Arrays;

import utils.*;


public class MergeSort implements Sort {

    public void sort(int[] arr) {
        doSort(arr, 0, arr.length - 1, new int[arr.length]);
    }

    private void doSort(int[] arr, int str, int end, int[] tmp) {
        if (str < end) {
            int mid = (str + end) / 2;
            doSort(arr, str, mid, tmp);
            doSort(arr, mid + 1, end, tmp);
            Utils.merge(arr, str, mid, end, tmp);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 2, 3, 6, 1};
        System.out.println(Arrays.toString(arr));

        Sort s = new MergeSort();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
