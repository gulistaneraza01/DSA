package Leetcode;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of element:");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            System.out.print(String.format("enter %d element:", i + 1));
            nums[i] = sc.nextInt();
        }

        int maxNum = nums[0];
        int minNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (maxNum < nums[i]) {
                maxNum = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (minNum > nums[i]) {
                minNum = nums[i];
            }
        }

        System.out.println(String.format(" max number in array:%d", maxNum));
        System.out.println(String.format(" min number in array:%d", minNum));
        sc.close();
    }
}
