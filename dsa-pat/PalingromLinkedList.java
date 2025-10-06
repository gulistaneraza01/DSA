package Leetcode;

import java.util.LinkedList;

public class PalingromLinkedList {
    public static boolean isPalindrome(LinkedList<Character> list, int start, int end) {
        if (start >= end) {
            System.out.println("palindrome");
            return true;
        }

        if (list.get(start) != list.get(end)) {
            System.out.println("not polindrome");
            return false;
        }

        return isPalindrome(list, start + 1, end - 1);
    }

    public static void main(String[] args) {

        LinkedList<Character> list = new LinkedList<>();

        list.add('R');
        list.add('a');
        list.add('a');
        list.add('R');

        boolean result = isPalindrome(list, 0, list.size() - 1);

        System.out.println(result);

    }

}
