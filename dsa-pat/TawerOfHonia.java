package Leetcode;

public class TawerOfHonia {
    protected static void Tower(int n, String source, String helper, String dest) {
        if (n == 1) {
            System.out.println(String.format("mover dist %d from %s to %d", n, source, dest));
            return;
        }

        Tower(n - 1, source, dest, helper);
        System.out.println(String.format("mover dist %d from %s to %d", n, source, dest));
        Tower(n - 1, helper, source, dest);
    }

    protected static void reverse(String str, int index) {
        if (str.length() == index) {
            return;
        }

        System.out.println(str.charAt(str.length() - 1 - index));

        reverse(str, index + 1);
    }

    public static int firstIndex = -1;
    public static int lastIndex = -1;

    protected static void firstAndLast(String str, int index) {
        if (str.length() == index) {
            return;
        }

        if (str.charAt(index) == 'a' && firstIndex == -1) {
            firstIndex = index;
        } else {
            lastIndex = index;
        }

        firstAndLast(str, index + 1);

    }

    protected static boolean isSort(int[] nums, int left, int right) {
        if (nums.length - 1 == right) {
            return true;
        }

        if (nums[left] < nums[right]) {
            return isSort(nums, left + 1, right + 1);
        } else {
            return false;
        }

    }

    // public static StringBuilder newStr = new StringBuilder("");
    public static String newStr = "";

    protected static void moveAllX(String str, int i, int count) {
        if (str.length() == i) {
            for (int j = 0; j < count; j++) {
                newStr += 'x';

                // newStr.insert(newStr.length(), "x");
            }

            System.out.println(newStr);
            return;
        }

        if (str.charAt(i) == 'x') {
            moveAllX(str, i + 1, count + 1);

        } else {
            // newStr.insert(newStr.length(), str.charAt(i));
            newStr += str.charAt(i);
            moveAllX(str, i + 1, count);
        }

    }

    public static boolean[] map = new boolean[32];
    public static String unique = "";

    protected static void removeDuplicate(String str, int i) {
        if (str.length() == i) {
            System.out.println(unique);
            return;
        }

        if (map[str.charAt(i) - 'a'] == true) {
            removeDuplicate(str, i + 1);
        } else {
            unique += str.charAt(i);
            map[str.charAt(i) - 'a'] = true;
            removeDuplicate(str, i + 1);
        }

    }

    public static void main(String[] args) {

        // firstAndLast(name, 0);

        // reverse(name, 0);

        // int n = 2;
        // Tower(n, "s", "h", "d");

        // int[] nums = { 1, 5, 6, 7 };

        // System.out.println(isSort(nums, 0, 1));
        // removeDuplicate(name, 0);

        int a = 1;

        System.out.println((char) (a + '0'));

        System.out.println(a);

    }
}
