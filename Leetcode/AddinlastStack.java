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

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        addtoLast(stack, 8);
        System.out.println(stack);
    }
}
