package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement169 {

    // Time complexcity -- O(n)
    // space complexcity -- O(n)
    public static int majorityElementByHashmap(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i]) + 1);

            } else {
                count.put(nums[i], 1);
            }
        }

        for (Integer key : count.keySet()) {
            if (count.get(key) > nums.length / 2) {
                return key;
            }
        }

        return -1;

    }

    // Time complexcity -- O(nlogn) due to sorting
    // space complexcity -- O(1)
    public static int majorityElementBySorted(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Time complexcity -- O(n) due to sorting
    // space complexcity -- O(1)
    public static int majorityElementByMorgan(int[] nums) {

        int count = 0;
        int candidate = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        int result1 = majorityElementByHashmap(nums);
        int result2 = majorityElementBySorted(nums);
        int result3 = majorityElementByMorgan(nums);

    }
}