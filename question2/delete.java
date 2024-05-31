package question2;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void deleteAtPosition(int position) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node previous = null;
        Node current = head;
        int count = 1;

        while (current != null && count < position) {
            previous = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Position out of range");
        }

        previous.next = current.next;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Example usage:
public class delete {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);
        linkedList.head.next.next.next = new Node(4);

        linkedList.display();  // Output: 1 2 3 4

        linkedList.deleteAtPosition(2);  // Deleting node at position 2

        linkedList.display();  // Output: 1 3 4
    }
}