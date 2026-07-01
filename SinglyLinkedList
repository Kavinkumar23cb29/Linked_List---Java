class SinglyLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // ===========================
    // 1. Insert at Beginning
    // ===========================
    public void insertFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // ===========================
    // 2. Insert at End
    // ===========================
    public void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // ===========================
    // 3. Insert at Position
    // Position starts from 1
    // ===========================
    public void insertAtPosition(int data, int position) {

        if (position == 1) {
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ===========================
    // 4. Delete First
    // ===========================
    public void deleteFirst() {

        if (head == null)
            return;

        head = head.next;
    }

    // ===========================
    // 5. Delete Last
    // ===========================
    public void deleteLast() {

        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // ===========================
    // 6. Delete by Position
    // ===========================
    public void deletePosition(int position) {

        if (head == null)
            return;

        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
    }

    // ===========================
    // 7. Search
    // ===========================
    public boolean search(int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key)
                return true;

            temp = temp.next;
        }

        return false;
    }

    // ===========================
    // 8. Update
    // ===========================
    public void update(int oldValue, int newValue) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }

            temp = temp.next;
        }

        System.out.println("Value not found");
    }

    // ===========================
    // 9. Count Nodes
    // ===========================
    public int size() {

        int count = 0;

        Node temp = head;

        while (temp != null) {

            count++;
            temp = temp.next;
        }

        return count;
    }

    // ===========================
    // 10. Reverse
    // ===========================
    public void reverse() {

        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {

            next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        head = prev;
    }

    // ===========================
    // 11. Display
    // ===========================
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(20);
        list.insertFirst(10);

        list.insertLast(30);
        list.insertLast(40);

        list.display();

        list.insertAtPosition(25, 3);

        list.display();

        list.deleteFirst();

        list.display();

        list.deleteLast();

        list.display();

        list.deletePosition(2);

        list.display();

        System.out.println(list.search(25));

        list.update(25, 50);

        list.display();

        System.out.println("Size = " + list.size());

        list.reverse();

        list.display();
    }
}
