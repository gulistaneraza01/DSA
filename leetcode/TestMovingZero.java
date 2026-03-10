package leetcode;

import java.util.Arrays;

public class TestMovingZero {

    public static int[] movingZero(int[] nums) {
        int read = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[read];
                nums[read] = temp;
                read++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 0, 1, 4, 0, 0 };
        int[] result1 = movingZero(nums);
        System.err.println(Arrays.toString(result1));
    }
}
