package Leetcode;

import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of Element:");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(String.format("enter %d element:", i + 1));
            nums[i] = sc.nextInt();
        }

        System.out.print("enter search Element:");
        int tar = sc.nextInt();

        int pos = searchPostion(nums, tar);

        if (pos != -1) {
            System.out.println(String.format(("at Postion %d"), pos));
        } else {
            System.out.println("not found");
        }

        sc.close();
    }

    protected static int searchPostion(int[] arr, int tar) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }
}
