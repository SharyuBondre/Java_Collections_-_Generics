package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // 1. add() - Insert element (throws exception if capacity is full)
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println("Queue after add(): " + queue);

        // 2. offer() - Insert element (returns false if capacity is full)
        queue.offer("Date");
        System.out.println("Queue after offer(): " + queue);

        // 3. peek() - Retrieve head without removing (null if empty)
        System.out.println("Peek: " + queue.peek());

        // 4. element() - Retrieve head without removing (throws exception if empty)
        System.out.println("Element: " + queue.element());

        // 5. poll() - Retrieve and remove head (null if empty)
        String polled = queue.poll();
        System.out.println("Polled element: " + polled);
        System.out.println("Queue after poll(): " + queue);

        // 6. remove() - Retrieve and remove head (throws exception if empty)
        String removed = queue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after remove(): " + queue);

        // 7. size() - Get number of elements
        System.out.println("Size of queue: " + queue.size());

        // 8. isEmpty() - Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 9. contains() - Check if element exists
        System.out.println("Contains 'Banana'? " + queue.contains("Banana"));

        // 10. clear() - Remove all elements
        queue.clear();
        System.out.println("After clear(): " + queue);
    }
}
