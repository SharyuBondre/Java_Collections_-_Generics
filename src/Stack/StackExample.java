package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // 1. push() - Add elements to the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");
        System.out.println("Stack after pushes: " + stack);

        // 2. pop() - Remove and return the top element
        String popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);

        // 3. peek() - Look at the top element without removing
        String top = stack.peek();
        System.out.println("Top element: " + top);

        // 4. search() - Search for an element (returns 1-based position from top)
        int position = stack.search("Banana");
        System.out.println("Position of 'Banana' from top: " + position);

        // 5. empty() - Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 6. size() - Get number of elements
        System.out.println("Size of stack: " + stack.size());

        // 7. contains() - Check if element exists
        System.out.println("Contains 'Apple'? " + stack.contains("Apple"));

        // 8. get(index) - Access element by index (inherited from Vector)
        System.out.println("Element at index 0: " + stack.get(0));

        // 9. set(index, value) - Replace element at index
        stack.set(0, "Apricot");
        System.out.println("After set at index 0: " + stack);

        // 10. clear() - Remove all elements
        stack.clear();
        System.out.println("After clear(): " + stack);
    }
}
