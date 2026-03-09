package Vector;

import java.util.Vector;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class VectorDemo {
    public static void main(String[] args) {
        // 1. Create a Vector
        Vector<String> vector = new Vector<>();

        // 2. Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add(1, "Mango"); // add at index

        // 3. Access elements
        System.out.println("Element at index 2: " + vector.get(2));

        // 4. Update elements
        vector.set(2, "Orange");

        // 5. Remove elements
        vector.remove("Banana"); // remove by value

        vector.remove(0);        // remove by index

        // 6. Size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // 7. Search elements
        System.out.println("Contains Mango? " + vector.contains("Mango"));
        System.out.println("Index of Orange: " + vector.indexOf("Orange"));
        System.out.println("Last index of Orange: " + vector.lastIndexOf("Orange"));

        // 8. First and last elements
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        // 9. Iterate with for-each
        System.out.println("Iterating with for-each:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // 10. Iterate with Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 11. Iterate with ListIterator (forward & backward)
        System.out.println("Iterating with ListIterator forward:");
        ListIterator<String> listItr = vector.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        System.out.println("Iterating with ListIterator backward:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        // 12. Iterate with Enumeration
        System.out.println("Iterating with Enumeration:");
        Enumeration<String> en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

        // 13. Clear vector
        vector.clear();
        System.out.println("Is vector empty? " + vector.isEmpty());

        // 14. Add multiple elements
        Collections.addAll(vector, "Kiwi", "Papaya", "Grapes");

        // 15. Sort vector
        Collections.sort(vector);
        System.out.println("Sorted vector: " + vector);

        // 16. Clone vector
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned vector: " + clonedVector);

        // 17. Convert to array
        Object[] array = vector.toArray();
        System.out.println("Array length: " + array.length);

        // 18. Ensure capacity
        vector.ensureCapacity(20);

        // 19. Trim to size
        vector.trimToSize();
    }
}