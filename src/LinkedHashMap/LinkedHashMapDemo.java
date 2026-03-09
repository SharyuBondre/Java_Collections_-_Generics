package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        // 1. put() - Add key-value pairs
        lhm.put(1, "Apple");
        lhm.put(2, "Banana");
        lhm.put(3, "Cherry");
        lhm.put(4, "Date");

        // 2. get() - Retrieve value by key
        System.out.println("Value at key 2: " + lhm.get(2));

        // 3. containsKey() - Check if a key exists
        System.out.println("Contains key 3? " + lhm.containsKey(3));

        // 4. containsValue() - Check if a value exists
        System.out.println("Contains value 'Apple'? " + lhm.containsValue("Apple"));

        // 5. remove() - Remove entry by key
        lhm.remove(4);
        System.out.println("After removing key 4: " + lhm);

        // 6. size() - Get number of entries
        System.out.println("Size of LinkedHashMap: " + lhm.size());

        // 7. isEmpty() - Check if empty
        System.out.println("Is LinkedHashMap empty? " + lhm.isEmpty());

        // 8. keySet() - Get all keys
        Set<Integer> keys = lhm.keySet();
        System.out.println("Keys: " + keys);

        // 9. values() - Get all values
        System.out.println("Values: " + lhm.values());

        // 10. entrySet() - Get all key-value pairs
        Set<Map.Entry<Integer, String>> entries = lhm.entrySet();
        System.out.println("Entries: " + entries);

        // 11. Iteration using for-each
        System.out.println("Iterating with for-each:");
        for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 12. replace() - Replace value for a key
        lhm.replace(2, "Blueberry");
        System.out.println("After replace: " + lhm);

        // 13. putIfAbsent() - Add only if key not present
        lhm.putIfAbsent(5, "Elderberry");
        System.out.println("After putIfAbsent: " + lhm);

        // 14. clear() - Remove all entries
        lhm.clear();
        System.out.println("After clear(): " + lhm);
    }
}
