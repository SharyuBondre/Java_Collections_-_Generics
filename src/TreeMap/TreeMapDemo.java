package TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        // 1. Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // 2. Add elements
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(4, "Cherry");
        map.put(2, "Mango");

        // 3. Overwrite value for existing key
        map.put(2, "Orange"); // replaces Mango

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

        // 9. First and last keys/entries
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());

        // 10. NavigableMap methods
        System.out.println("Higher key than 2: " + map.higherKey(2));
        System.out.println("Lower key than 2: " + map.lowerKey(2));
        System.out.println("Ceiling entry for 2: " + map.ceilingEntry(2));
        System.out.println("Floor entry for 2: " + map.floorEntry(2));

        // 11. Submaps
        System.out.println("HeadMap (before key 3): " + map.headMap(3));
        System.out.println("TailMap (from key 2): " + map.tailMap(2));
        System.out.println("SubMap (1 to 3): " + map.subMap(1, 3));

        // 12. Polling (removes and returns)
        System.out.println("Poll first entry: " + map.pollFirstEntry());
        System.out.println("Poll last entry: " + map.pollLastEntry());
        System.out.println("After polling: " + map);

        // 13. Iterate over keys
        System.out.println("Iterating over keys:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // 14. Iterate over values
        System.out.println("Iterating over values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 15. Iterate over entries
        System.out.println("Iterating over entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 16. Replace values
        map.replace(1, "Strawberry");
        map.replace(3, "Apple", "Blueberry"); // conditional replace

        // 17. Merge values
        map.merge(5, "Juice", (oldVal, newVal) -> oldVal + "-" + newVal);

        // 18. Compute values
        map.compute(6, (key, val) -> (val == null) ? "NewFruit" : val.toUpperCase());
        map.computeIfAbsent(7, k -> "Guava");
        map.computeIfPresent(5, (k, v) -> v.toUpperCase());

        // 19. Clone TreeMap
        TreeMap<Integer, String> clonedMap = (TreeMap<Integer, String>) map.clone();
        System.out.println("Cloned map: " + clonedMap);

        // 20. Clear map
        map.clear();
        System.out.println("Is map empty after clear? " + map.isEmpty());
    }
}
