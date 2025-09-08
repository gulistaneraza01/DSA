package Leetcode;

import java.util.Scanner;

public class IsAscending {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };

        Boolean isSorted = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted == true) {
            System.out.println("sorted in ascending order");
        } else {
            System.out.println("not sorted in ascending order");

        }

    }
}