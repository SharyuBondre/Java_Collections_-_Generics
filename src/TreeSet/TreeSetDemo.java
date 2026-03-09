package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
    public static void main(String[] args) {
        // 1. Create a TreeSet
        TreeSet<String> set = new TreeSet<>();

        // 2. Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Mango");

        // 3. Attempt to add duplicate
        boolean added = set.add("Apple"); // returns false
        System.out.println("Adding duplicate Apple? " + added);

        // 4. Size and check empty
        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());

        // 5. Search elements
        System.out.println("Contains Mango? " + set.contains("Mango"));
        System.out.println("Contains Orange? " + set.contains("Orange"));

        // 6. First and last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // 7. NavigableSet methods
        System.out.println("Higher than Banana: " + set.higher("Banana"));
        System.out.println("Lower than Banana: " + set.lower("Banana"));
        System.out.println("Ceiling of Blueberry: " + set.ceiling("Blueberry"));
        System.out.println("Floor of Blueberry: " + set.floor("Blueberry"));

        // 8. Subsets
        System.out.println("HeadSet (before Mango): " + set.headSet("Mango"));
        System.out.println("TailSet (from Mango): " + set.tailSet("Mango"));
        System.out.println("SubSet (Banana to Mango): " + set.subSet("Banana", "Mango"));

        // 9. Polling (removes and returns)
        System.out.println("Poll first: " + set.pollFirst());
        System.out.println("Poll last: " + set.pollLast());
        System.out.println("After polling: " + set);

        // 10. Iterate with for-each
        System.out.println("Iterating with for-each:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 11. Iterate with Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 12. Descending order
        System.out.println("Descending set: " + set.descendingSet());

        // 13. Clone TreeSet
        TreeSet<String> clonedSet = (TreeSet<String>) set.clone();
        System.out.println("Cloned set: " + clonedSet);

        // 14. Convert to array
        Object[] array = set.toArray();
        System.out.println("Array length: " + array.length);

        // 15. Clear set
        set.clear();
        System.out.println("Is set empty after clear? " + set.isEmpty());
    }
}
