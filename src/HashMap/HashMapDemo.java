package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapDemo {
    public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Add elements (put)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        // 3. Overwrite value for existing key
        map.put(2, "Orange"); // replaces Banana

        // 4. Add with putIfAbsent
        map.putIfAbsent(5, "Papaya");
        map.putIfAbsent(2, "Kiwi"); // won't overwrite Orange

        // 5. Access elements
        System.out.println("Value for key 3: " + map.get(3));
        System.out.println("Value for non-existing key: " + map.getOrDefault(10, "Default"));

        // 6. Remove elements
        map.remove(4); // remove by key
        map.remove(2, "Orange"); // remove by key-value pair

        // 7. Size and check empty
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());

        // 8. Search elements
        System.out.println("Contains key 1? " + map.containsKey(1));
        System.out.println("Contains value Cherry? " + map.containsValue("Cherry"));

        // 9. Iterate over keys
        System.out.println("Iterating over keys:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // 10. Iterate over values
        System.out.println("Iterating over values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 11. Iterate over entries
        System.out.println("Iterating over entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 12. Replace values
        map.replace(1, "Strawberry");
        map.replace(3, "Cherry", "Blueberry"); // conditional replace

        // 13. Merge values
        map.merge(5, "Juice", (oldVal, newVal) -> oldVal + "-" + newVal);

        // 14. Compute values
        map.compute(6, (key, val) -> (val == null) ? "NewFruit" : val.toUpperCase());
        map.computeIfAbsent(7, k -> "Guava");
        map.computeIfPresent(5, (k, v) -> v.toUpperCase());

        // 15. Clone map
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned map: " + clonedMap);

        // 16. Views
        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        System.out.println("Keys view: " + keys);
        System.out.println("Values view: " + values);
        System.out.println("Entries view: " + entries);

        // 17. Clear map
        map.clear();
        System.out.println("Is map empty after clear? " + map.isEmpty());
    }
}
