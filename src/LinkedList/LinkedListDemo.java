package LinkedList;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        // 1. Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 2. Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Mango"); // add at index

        // 3. Access elements
        System.out.println("Element at index 2: " + list.get(2));

        // 4. Update elements
        list.set(2, "Orange");

        // 5. Remove elements
        list.remove("Banana"); // remove by value

        list.remove(0);        // remove by index

        // 6. Size and check empty
        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty());

        // 7. Search elements
        System.out.println("Contains Mango? " + list.contains("Mango"));
        System.out.println("Index of Orange: " + list.indexOf("Orange"));
        System.out.println("Last index of Orange: " + list.lastIndexOf("Orange"));

        // 8. First and last elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // 9. Queue operations
        list.addFirst("Kiwi");
        list.addLast("Papaya");
        System.out.println("After addFirst & addLast: " + list);

        System.out.println("Peek: " + list.peek());
        System.out.println("Poll: " + list.poll());
        System.out.println("After poll: " + list);

        System.out.println("Offer: " + list.offer("Grapes"));
        System.out.println("After offer: " + list);

        // 10. Stack operations
        list.push("Pineapple");
        System.out.println("After push: " + list);
        System.out.println("Pop: " + list.pop());
        System.out.println("After pop: " + list);

        // 11. Iterate with for-each
        System.out.println("Iterating with for-each:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 12. Iterate with Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 13. Iterate with ListIterator (forward & backward)
        System.out.println("Iterating with ListIterator forward:");
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        System.out.println("Iterating with ListIterator backward:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        // 14. Clear list
        list.clear();
        System.out.println("Is list empty after clear? " + list.isEmpty());

        // 15. Add multiple elements
        Collections.addAll(list, "Strawberry", "Blueberry", "Blackberry");

        // 16. Sort list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 17. Convert to array
        Object[] array = list.toArray();
        System.out.println("Array length: " + array.length);

        // 18. Clone list
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);
    }
}
