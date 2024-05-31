package question1;
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

    void insertAtPos(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int count = 0;

            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }

            if (current == null) {
                throw new IndexOutOfBoundsException("Position out of range");
            }

            newNode.next = current.next;
            current.next = newNode;
        }
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
public class insert {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtPos(1, 0);  // Inserting 1 at position 0
        linkedList.insertAtPos(2, 1);  // Inserting 2 at position 1
        linkedList.insertAtPos(3, 2);  // Inserting 3 at position 2
        linkedList.insertAtPos(4, 1);  // Inserting 4 at position 1

        linkedList.display();  // Output: 1 4 2 3
    }
}