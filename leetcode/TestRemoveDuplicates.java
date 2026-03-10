package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestRemoveDuplicates {
    public static int[] removeDuplicate(int[] nums) {
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[left] != nums[i]) {

                nums[left + 1] = nums[i];

                left++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 3, 3, 4, 4, 4, 4 }; // [1,3,4,_,_,_,_,_,_,_]
        int[] result = removeDuplicate(nums);

        System.out.println(Arrays.toString(result));
    }
}