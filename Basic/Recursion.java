package Basic;

import java.util.Arrays;

public class Recursion {
    protected static void printNum5to1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum5to1(n - 1);
    }

    protected static void printNum1to5(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNum1to5(n + 1);
    }

    protected static void printNumber(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.println(start);
        printNumber(start + 1, end);
    }

    protected static int factoril(int n) {
        if (n == 0)
            return 1;

        return n * factoril(n - 1);
    }

    protected static void printArray(int[] nums, int index) {
        if (index == nums.length)
            return;

        System.out.println(nums[index]);
        printArray(nums, index + 1);
    }

    protected static void reverseArr(int[] nums, int left, int right) {
        if (left >= right) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        reverseArr(nums, left + 1, right - 1);

    }

    public static void main(String[] args) {

        // printNum5to1(5);
        // printNum1to5(1);
        // printNumber(1, 6);
        int fact = factoril(5);

        int[] nums = { 5, 3, 6, 7 };
        // printArray(nums, 0);
        reverseArr(nums, 0, nums.length - 1);

    }
}
