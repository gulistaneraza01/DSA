package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductofArrayExceptSelf238 {

    // Time Complexcity -- O(n^2)
    // Space Complexcity -- O(n)

    // public static int[] productExceptSelf(int[] nums) {
    // int[] result = new int[nums.length];

    // for (int i = 0; i < nums.length; i++) {
    // int product = 1;
    // for (int j = 0; j < nums.length; j++) {
    // if (i == j) {
    // continue;
    // }
    // product *= nums[j];
    // }
    // result[i] = product;
    // }

    // return result;
    // }

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4 };
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
