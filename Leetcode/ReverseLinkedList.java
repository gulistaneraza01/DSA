// package Leetcode;

// import java.util.LinkedList;

// public class ReverseLinkedList {

//     // Method to reverse a LinkedList in place using recursion
//     public static void reverse(LinkedList<String> list, int start, int end) {
//         if (start >= end) {
//             return;
//         }

//         String temp = list.get(start);
//         list.set(start, list.get(end), list.get(start));
//         list.set(end, temp);

//         reverse(list, start + 1, end - 1);
//     }

//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<>();
//         list.add("raza");
//         list.add("raju");
//         list.add("Gulistane");
//         list.add("shabistane");

//         // The correct indices for reversing are 0 and list.size() - 1
//         reverse(list, 0, list.size() - 1);

//         System.out.println(list);
//     }
// }

package Leetcode;

import java.util.LinkedList;

public class ReverseLinkedList {

    public static void reverse(LinkedList<String> list, int start, int end) {
        if (start >= end) {
            return;
        }

        String temp = list.get(start);
        list.set(start, list.get(end));
        list.set(end, temp);

        reverse(list, start + 1, end - 1);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("raza");
        list.add("raju");
        list.add("Gulistane");
        list.add("shabistane");

        System.out.println(list.reversed());
    }
}
