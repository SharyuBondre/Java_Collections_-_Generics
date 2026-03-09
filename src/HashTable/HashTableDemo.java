package HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Enumeration;

public class HashTableDemo {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> ht = new Hashtable<>();

        // 1. put() - Add key-value pairs
        ht.put(1, "Apple");
        ht.put(2, "Banana");
        ht.put(3, "Cherry");
        ht.put(4, "Date");

        // 2. get() - Retrieve value by key
        System.out.println("Value at key 2: " + ht.get(2));

        // 3. containsKey() - Check if a key exists
        System.out.println("Contains key 3? " + ht.containsKey(3));

        // 4. containsValue() - Check if a value exists
        System.out.println("Contains value 'Apple'? " + ht.containsValue("Apple"));

        // 5. remove() - Remove entry by key
        ht.remove(4);
        System.out.println("After removing key 4: " + ht);

        // 6. size() - Get number of entries
        System.out.println("Size of Hashtable: " + ht.size());

        // 7. isEmpty() - Check if empty
        System.out.println("Is Hashtable empty? " + ht.isEmpty());

        // 8. keySet() - Get all keys
        Set<Integer> keys = ht.keySet();
        System.out.println("Keys: " + keys);

        // 9. values() - Get all values
        System.out.println("Values: " + ht.values());

        // 10. entrySet() - Get all key-value pairs
        Set<Map.Entry<Integer, String>> entries = ht.entrySet();
        System.out.println("Entries: " + entries);

        // 11. Enumeration - Iterate through keys
        Enumeration<Integer> e = ht.keys();
        System.out.print("Iterating keys: ");
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        // 12. clear() - Remove all entries
        ht.clear();
        System.out.println("After clear(): " + ht);
    }
}