package Leetcode;

import java.util.Arrays;

public class SortInsertion {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 7 };

        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curr;

        }

        System.out.println(Arrays.toString(arr));
    }
}
