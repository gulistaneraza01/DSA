package Leetcode;

import java.util.Stack;

// This class implements a queue using two stacks
public class twoStackQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public twoStackQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Enqueue operation (add to queue)
    public void enqueue(int data) {
        s1.push(data);
    }

    // Dequeue operation (remove from queue)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (s2.isEmpty()) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // Peek operation (front of queue)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        twoStackQueue queue = new twoStackQueue();

        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(8);

        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 1
        queue.enqueue(5);
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.peek()); // 8
        System.out.println(queue.dequeue()); // 8
        System.out.println(queue.dequeue()); // 5
        // Uncommenting below will throw exception
        // System.out.println(queue.dequeue());
    }
}
