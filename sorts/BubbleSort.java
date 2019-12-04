package sorts;

import java.util.Arrays;

import utils.*;


public class BubbleSort implements Sort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j])
                    Utils.swap(arr, j, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 2, 3, 6, 1};
        System.out.println(Arrays.toString(arr));

        Sort s = new BubbleSort();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
