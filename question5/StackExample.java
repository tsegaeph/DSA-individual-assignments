package question5;

public class StackExample {
	    public static void main(String[] args) {
	        Stack stack = new Stack();

	        stack.push(1);
	        stack.push(2);
	        stack.push(3);

	        System.out.println("Peek: " + stack.peek());  // Output: Peek: 3

	        System.out.println("Pop: " + stack.pop());    // Output: Pop: 3
	        System.out.println("Pop: " + stack.pop());    // Output: Pop: 2

	        stack.push(4);

	        System.out.println("Peek: " + stack.peek());  // Output: Peek: 4
	        System.out.println("Pop: " + stack.pop());    // Output: Pop: 4

	        System.out.println("Is Empty: " + stack.isEmpty());  // Output: Is Empty: false
	        System.out.println("Pop: " + stack.pop());           // Output: Pop: 1
	        System.out.println("Is Empty: " + stack.isEmpty());  // Output: Is Empty: true
	    }
	}