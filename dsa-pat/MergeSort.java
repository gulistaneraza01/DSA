package Leetcode;

import java.util.Arrays;

public class MergeSort {

    protected static void conquer(int[] arr, int start, int mid, int end) {
        int[] mergedArr = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid + 1;
        int idx = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArr[idx] = arr[idx1];
                idx1++;
                idx++;
            } else {
                mergedArr[idx] = arr[idx2];
                idx2++;
                idx++;
            }
        }

        while (idx1 <= mid) {
            mergedArr[idx] = arr[idx1];
            idx1++;
            idx++;
        }

        while (idx2 <= end) {
            mergedArr[idx] = arr[idx2];
            idx2++;
            idx++;
        }

        for (int i = 0, j = start; i < mergedArr.length; i++, j++) {
            arr[j] = mergedArr[i];
        }

    }

    protected static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        divide(arr, start, mid);
        divide(arr, mid + 1, end);

        conquer(arr, start, mid, end);

    }

    public static void main(String[] args) {

        int[] unSorted = { 2, 1, 5, 3, 4, 8 };

        divide(unSorted, 0, unSorted.length - 1);

        System.out.println(Arrays.toString(unSorted));

    }

}
