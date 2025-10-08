package leetcode;

import java.util.Arrays;

public class MoveZeroes283 {

    // TimeComplexcity -- O(n^2)
    // SpaceComplexcity -- O(1)

    // public static void moveZero(int[] nums) {
    // int n = nums.length;

    // for (int i = 0; i < n; i++) {
    // if (nums[i] == 0) {
    // for (int j = i; j < n; j++) {
    // if (nums[j] != 0) {
    // int temp = nums[i];
    // nums[i] = nums[j];
    // nums[j] = temp;
    // break;
    // }
    // }
    // }
    // }

    // System.out.println(Arrays.toString(nums));
    // }

    public static void moveZero(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap only if needed
                if (i != lastNonZeroFoundAt) {
                    int temp = nums[i];
                    nums[i] = nums[lastNonZeroFoundAt];
                    nums[lastNonZeroFoundAt] = temp;
                }
                lastNonZeroFoundAt++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZero(nums);
    }
}