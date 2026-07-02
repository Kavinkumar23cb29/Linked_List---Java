class DoublyLinkedList {

    // Node class
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // ==========================
    // 1. Insert at Beginning
    // ==========================
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // ==========================
    // 2. Insert at End
    // ==========================
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // ==========================
    // 3. Insert at Position
    // ==========================
    public void insertAtPosition(int position, int data) {

        if (position <= 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // ==========================
    // 4. Delete from Beginning
    // ==========================
    public void deleteBeginning() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // ==========================
    // 5. Delete from End
    // ==========================
    public void deleteEnd() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // ==========================
    // 6. Delete by Value
    // ==========================
    public void deleteByValue(int value) {

        if (head == null)
            return;

        if (head.data == value) {
            deleteBeginning();
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null)
            return;

        if (temp == tail) {
            deleteEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // ==========================
    // 7. Search
    // ==========================
    public boolean search(int value) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == value)
                return true;

            temp = temp.next;
        }

        return false;
    }

    // ==========================
    // 8. Display Forward
    // ==========================
    public void displayForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // ==========================
    // 9. Display Backward
    // ==========================
    public void displayBackward() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("NULL");
    }

    // ==========================
    // 10. Count Nodes
    // ==========================
    public int size() {

        int count = 0;

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // ==========================
    // 11. Reverse DLL
    // ==========================
    public void reverse() {

        Node current = head;
        Node temp = null;

        while (current != null) {

            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        Node t = head;
        head = tail;
        tail = t;
    }

    // ==========================
    // 12. Is Empty
    // ==========================
    public boolean isEmpty() {
        return head == null;
    }

    // ==========================
    // 13. Clear List
    // ==========================
    public void clear() {
        head = null;
        tail = null;
    }
}


public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();

        list.insertAtBeginning(5);

        System.out.println("After Insert Beginning:");
        list.displayForward();

        list.insertAtPosition(3, 15);

        System.out.println("After Insert Position:");
        list.displayForward();

        list.deleteBeginning();

        System.out.println("After Delete Beginning:");
        list.displayForward();

        list.deleteEnd();

        System.out.println("After Delete End:");
        list.displayForward();

        list.deleteByValue(15);

        System.out.println("After Delete Value:");
        list.displayForward();

        System.out.println("Search 20 : " + list.search(20));

        System.out.println("Size : " + list.size());

        list.reverse();

        System.out.println("After Reverse:");
        list.displayForward();

        list.clear();

        System.out.println("Is Empty : " + list.isEmpty());
    }
}
