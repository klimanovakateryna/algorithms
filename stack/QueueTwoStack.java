import java.util.Stack;

public class QueueTwoStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
    public QueueTwoStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    // Pushes element x to the back of the queue
    public void push(int x) {
        stack1.add(x); // add to the first stack
    }

    // Removes the element from the front of the queue and returns it
    public int pop() {
        // Move the top elements to the second stack except for the first one
        while (stack1.size() > 1) {
            stack2.add(stack1.pop());
        }

        // Pop the remaining element in the first stack
        int val = stack1.pop();

        // Move the elements from the second stack back to the first
        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }
        
        return val;
    }

    // Returns the element at the front of the queue
    public int peek() {
        // Move the top elements to the second stack except for the first one
        while (stack1.size() > 1) {
            stack2.add(stack1.pop());
        }
        
        // Pop the remaining element in the first stack and store it
        int val = stack1.pop();
        // Add it back
        stack1.add(val);
        // Move the elements from the second stack back to the first
        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }

        return val;
    }

    // Returns true if the queue is empty, false otherwise
    public boolean empty() {
        return stack1.size() == 0;
    }

    // Main method to test the QueueTwoStack class
    public static void main(String[] args) {
        QueueTwoStack queue = new QueueTwoStack();
        
        // Testing push
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println("Queue after pushes: 1, 2, 3");

        // Testing pop
        System.out.println("Popped element: " + queue.pop()); // Should print 1
        System.out.println("Popped element: " + queue.pop()); // Should print 2

        // Testing peek
        queue.push(4);
        System.out.println("Element at front: " + queue.peek()); // Should print 3

        // Testing empty
        System.out.println("Is queue empty? " + queue.empty()); // Should print false

        // Testing pop
        System.out.println("Popped element: " + queue.pop()); // Should print 3
        System.out.println("Popped element: " + queue.pop()); // Should print 4
        System.out.println("Is queue empty? " + queue.empty()); // Should print true
    }
}
