package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of element:");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            System.out.print(String.format("enter %d element:", i + 1));
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.err.println("\n" + Arrays.toString(nums));

        sc.close();
    }
}
