package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 2. Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Mango"); // add at index


        System.out.println("Element present in list: " + list);

        // 3. Access elements
        System.out.println("Element at index 2: " + list.get(2));

        // 4. Update elements
        list.set(2, "Orange");

        System.out.println("Element after update: " + list);



        // 5. Remove elements
        list.remove("Banana"); // remove by value
        System.out.println("Element after remove op: " + list);


        list.remove(0);        // remove by index
        System.out.println("Element after remove by index op: " + list);


        // 6. Check size
        System.out.println("Size: " + list.size());

        // 7. Search elements
        System.out.println("Contains Mango? " + list.contains("Mango"));

        //(First occurrence)it will check from left to right
        System.out.println("Index of Orange: " + list.indexOf("Orange"));

        // (Last occurrence)it will check from right to left
        System.out.println("Last index of Orange: " + list.lastIndexOf("Orange"));

        // 8. Iterate
        System.out.println("Iterating with for-each:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 9. Clear list
        list.clear();
        System.out.println("Is list empty? " + list.isEmpty());

        // 10. Add multiple elements
        Collections.addAll(list, "Kiwi", "Papaya", "Grapes");

        // 11. Sort list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 12. Clone list
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // 13. Convert to array
        Object[] array = list.toArray();
        System.out.println("Array length: " + array.length);

        // 14. Ensure capacity
        list.ensureCapacity(20);

        // 15. Trim to size
        list.trimToSize();
    }
}
