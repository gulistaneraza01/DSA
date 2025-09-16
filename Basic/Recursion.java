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

    protected static void resverStr(StringBuffer name, int left, int right) {
        if (left >= right) {
            System.out.println(name);
            return;
        }

        char temp = name.charAt(left);
        name.setCharAt(left, name.charAt(right));
        name.setCharAt(right, temp);

        resverStr(name, left + 1, right - 1);
    }

    public static void isPalindrome(String str) {
        isPalindrome(str, 0, str.length() - 1);
    }

    public static void isPalindrome(String str, int left, int right) {
        if (left >= right) {
            System.out.println("str is palindrome");
            return;
        }

        if (str.charAt(left) != str.charAt(right)) {
            System.out.println("str is not palindrome");
            return;
        }

        isPalindrome(str, left + 1, right - 1);
    }

    protected static int fibo(int num) {
        if (num <= 1) {
            return num;
        }

        return fibo(num - 1) + fibo(num - 2);
    }

    protected static int calPow(int base, int power) {
        if (power == 0) {
            return 0;
        }
        if (power == 1) {
            return base;
        }

        // if (power % 2 == 0) {
        // return calPow(base * base, power - 1);
        // } else {
        // return calPow(base * base, power - 1) * base;
        // }

        int halfPow = calPow(base, power / 2);

        if (halfPow % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return halfPow * halfPow * base;
        }

    }

    protected static int biggerNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    // protected static int findMax(int[] nums) {
    // if (nums.length == 0) {
    // return -1;
    // }

    // if (nums.length == 1) {
    // return nums[0];
    // }

    // return biggerNum(nums[0], findMax(Arrays.copyOfRange(nums, 1, nums.length)));
    // }
    protected static int findMax(int[] nums, int i) {
        if (nums.length - 1 == i) {
            return nums[i];
        }

        return biggerNum(nums[i], findMax(nums, i + 1));
    }

    public static void main(String[] args) {

        // printNum5to1(5);
        // printNum1to5(1);
        // printNumber(1, 6);
        // int fact = factoril(5);

        // int[] nums = { 5, 3, 6, 7 };
        // reverseArr(nums, 0, nums.length - 1);

        // String name = "helleh";
        // StringBuffer sb = new StringBuffer(name);
        // resverStr(sb, 0, sb.length() - 1);
        // isPalindrome(name);

        // for (int i = 0; i <= 10; i++) {
        // System.out.print(fibo(i) + " ");
        // }
        // System.out.println();

        // System.out.println(calPow(2, 5));
        // System.out.println(5 / 2);

        int[] nums = { 1, 5, 3, 1, 4, 32, 22 };

        System.out.println(findMax(nums, 0));

    }
}
