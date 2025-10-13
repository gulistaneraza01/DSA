package leetcode;

import java.sql.Time;
import java.util.Arrays;

public class RotateArray189 {

    // Time Complexcity -- O(n^2)
    // Sapce Complexcity -- O(1)

    // public static void rotateArray(int[] nums, int k) {
    // int n = nums.length;

    // k = k % n;

    // for (int i = 0; i < k; i++) {
    // int previous = nums[n - 1];

    // System.out.println(previous);

    // for (int j = n - 1; j > 0; j--) {
    // nums[j] = nums[j - 1];
    // }

    // nums[0] = previous;
    // }
    // }

    public static void reverse(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        reverse(nums, left + 1, right - 1);
    }

    // Time Complexcity -- O(n)
    // Sapce Complexcity -- O(1)

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;

        k = k % n;
        if (k == 0) {
            return;
        }

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 7, 8, 6 };
        rotateArray(nums, 8);
        System.out.println(Arrays.toString(nums));
    }
}