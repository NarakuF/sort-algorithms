package sorts;

import java.util.Arrays;

import utils.*;


public class SelectionSort implements Sort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            if (minIdx != i)
                Utils.swap(arr, i, minIdx);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 2, 3, 6, 1};
        System.out.println(Arrays.toString(arr));

        Sort s = new SelectionSort();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
