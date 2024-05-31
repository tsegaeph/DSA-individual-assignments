package question3;
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

    void deleteAfterNode(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("Given node cannot be null");
        }

        if (node.next == null) {
            throw new IllegalArgumentException("Given node does not have a next node");
        }

        Node nodeToDelete = node.next;
        node.next = nodeToDelete.next;
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
public class deleteAfter {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);
        linkedList.head.next.next.next = new Node(4);

        linkedList.display();  // Output: 1 2 3 4

        Node givenNode = linkedList.head.next;
        linkedList.deleteAfterNode(givenNode);  // Deleting node after given node (node with value 2)

        linkedList.display();  // Output: 1 2 4
    }
}