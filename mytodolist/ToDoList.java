package mytodolist;
class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }
}

class Node {
    private Task task;
    private Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }

    public Task getTask() {
        return task;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class ToDoList {
    private Node head;

    public void addToDo(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markCompleted();
                return;
            }
            current = current.getNext();
        }
        System.out.println("Task '" + title + "' not found.");
    }

    public void viewToDoList() {
        Node current = head;
        if (current == null) {
            System.out.println("ToDo list is empty.");
        } else {
            System.out.println("ToDo list:");
            while (current != null) {
                Task task = current.getTask();
                String status = task.isCompleted() ? "[X]" : "[ ]";
                System.out.println(status + " " + task.getTitle() + ": " + task.getDescription());
                current = current.getNext();
            }
        }
    }
}
