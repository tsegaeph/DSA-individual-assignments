package mytodolist;

public class example {
	
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();

        // Adding tasks
        todoList.addToDo(new Task("Task 1", "Description 1"));
        todoList.addToDo(new Task("Task 2", "Description 2"));
        todoList.addToDo(new Task("Task 3", "Description 3"));

        // Marking a task as completed
        todoList.markToDoAsCompleted("Task 2");

        // Viewing the to-do list
        todoList.viewToDoList();
    }
}