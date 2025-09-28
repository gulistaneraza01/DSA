package Leetcode;

import java.util.Stack;

public class AddinlastStack {
    public static void addtoLast(Stack<Integer> stack, int item) {
        if (stack.size() == 0) {
            stack.push(item);
            return;
        }

        int deleteItem = stack.pop();

        addtoLast(stack, item);

        stack.push(deleteItem);
    }

    public static void reverStack(Stack<Integer> stack) {
        if (stack.size() == 0) {
            return;
        }
        int deleteItemTop = stack.pop();
        reverStack(stack);
        addtoLast(stack, deleteItemTop);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(0);

        // addtoLast(stack, 8);
        reverStack(stack);
        System.out.println(stack);
    }
}
