package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        // 1. Create a HashSet
        HashSet<String> set = new HashSet<>();

        // 2. Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Mango");

        // 3. Attempt to add duplicate
        boolean added = set.add("Apple"); // will return false
        System.out.println("Adding duplicate Apple? " + added);

        // 4. Size and check empty
        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());

        // 5. Search elements
        System.out.println("Contains Mango? " + set.contains("Mango"));
        System.out.println("Contains Orange? " + set.contains("Orange"));

        // 6. Remove elements
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // 7. Iterate with for-each
        System.out.println("Iterating with for-each:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 8. Iterate with Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 9. Clone HashSet
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned set: " + clonedSet);

        // 10. Convert to array
        Object[] array = set.toArray();
        System.out.println("Array length: " + array.length);

        // 11. Clear set
        set.clear();
        System.out.println("Is set empty after clear? " + set.isEmpty());
    }
}
