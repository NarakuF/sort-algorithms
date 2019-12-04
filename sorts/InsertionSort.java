package sorts;

import java.util.Arrays;

import utils.*;


public class InsertionSort implements Sort {

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    Utils.swap(arr, j - 1, j);
                else
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 2, 3, 6, 1};
        System.out.println(Arrays.toString(arr));

        Sort s = new InsertionSort();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
