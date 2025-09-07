package Basic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[4];
        String[] name = new String[2];

        int[] copy = nums;
        nums[0] = 3;
        copy[3] = 5;

        System.out.println(copy == nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < 2; i++) {
            System.out.println(name[i]);
        }

    }

}
