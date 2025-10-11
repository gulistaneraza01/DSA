package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray26 {
    public static int removeDuplicatesfromSortedArray(int[] nums) {
        int n = nums.length;
        int left = 0;

        if (n == 0) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if (nums[left] != nums[i]) {
                nums[left + 1] = nums[i];
                left++;
            }
        }

        return left + 1;

    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 2, 3, 4, 5, 5, 6 };
        removeDuplicatesfromSortedArray(nums);

    }
}
