package question4;
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

    Node searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return current;
            }
            current = current.next;
        }
        return null; // Node not found
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
public class searching {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);
        linkedList.head.next.next.next = new Node(4);

        linkedList.display();  // Output: 1 2 3 4

        int searchValue = 3;
        Node foundNode = linkedList.searchNode(searchValue);

        if (foundNode != null) {
            System.out.println("Node with value " + searchValue + " found.");
        } else {
            System.out.println("Node with value " + searchValue + " not found.");
        }
    }
}