package Basic;

import java.util.*;

public class StackExample {

    public static class Node { // Make Node static
        int head;
        Node next;

        public Node(int head) {
            this.head = head;
            next = null;
        }
    }

    public static class Stackq { // Make Stack static for consistency

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
            return;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int removeData = list.remove(list.size() - 1);
            return removeData;
        }

        public static int peak() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }

        // public static Node head;

        // public static boolean isEmpty() {
        // return head == null;
        // }

        // public static void push(int data) {
        // Node newNode = new Node(data); // Now this works because Node is static

        // if (isEmpty()) {
        // head = newNode;
        // return;
        // }

        // newNode.next = head;
        // head = newNode;

        // }

        // public static int pop() {
        // if (isEmpty()) {
        // return -1;
        // }

        // int topNode = head.head; // Changed from head.data to head.head to match Node
        // definition
        // head = head.next;
        // return topNode;
        // }

        // public static int peak() {
        // if (isEmpty()) {
        // return -1;
        // }

        // return head.head;
        // }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }
}
