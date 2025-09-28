package Basic;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
// import java.util.Queue;
import java.util.Stack;

public class QueueDemo {

    // static public class Queue {
    // static int[] arr;
    // static int size;
    // static int rear = -1;
    // static int front = -1;

    // Queue(int n) {
    // arr = new int[n];
    // this.size = n;
    // }

    // public static boolean isEmpty() {
    // return rear == -1 && front == -1;
    // }

    // public static boolean isFull() {
    // return front == (rear + 1) % size;
    // }

    // public static void add(int item) {
    // if (isFull()) {
    // System.out.println("queue is full");
    // return;
    // }

    // if (front == -1) {
    // front++;
    // }

    // rear = (rear + 1) % size;
    // arr[rear] = item;
    // }

    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }

    // int removeItem = arr[front];

    // if (front == rear) {
    // arr[front] = 0;
    // front = -1;
    // rear = -1;
    // } else {
    // arr[front] = 0;
    // front = (front + 1) % size;
    // }

    // System.out.println("front value=" + front);
    // return removeItem;

    // }

    // public static void printArr() {
    // System.out.println(Arrays.toString(arr));
    // }

    // }

    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> q = new ArrayDeque<Integer>();

        System.out.println(q.isEmpty());
        q.add(2);
        q.add(3);
        q.add(8);
        System.out.println(q);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        q.add(1);

        System.out.println(q);

    }
}
