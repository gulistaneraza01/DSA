package Basic;

public class LinkedList {

    Node head;

    private int size;

    LinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addList(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;

        size++;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;

    }

    public void printList() {
        if (head == null) {
            System.out.print("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.print("LinkedList is Empty");
            return;
        }

        head = head.next;
        size--;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.print("LinkedList is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node secLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secLastNode = secLastNode.next;
        }

        secLastNode.next = null;
        size--;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addList("hello");

        ll.addList("how ");

        ll.addLast("raza ");

        ll.deleteFirst();
        ll.printList();
        System.out.println("size of:" + ll.size);

        ll.deleteLast();
        ll.printList();
        System.out.println("size of:" + ll.size);

        ll.printList();
        System.out.println("size of:" + ll.size);

    }
}
