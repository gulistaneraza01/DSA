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

    public static void main(String[] args) {

        String name = "razaxa";
        firstAndLast(name, 0);

        System.out.println(firstIndex);
        System.out.println(lastIndex);

        // reverse(name, 0);

        // int n = 2;
        // Tower(n, "s", "h", "d");
    }
}
