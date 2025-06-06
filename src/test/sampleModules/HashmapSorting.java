package test.sampleModules;

import java.util.*;

public class HashmapSorting {

    public static void main(String[] args){

       // HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String,Integer> map= new LinkedHashMap<>();
        map.put("apple", 10);
        map.put("banana", 5);
        map.put("orange", 15);
        map.put("grape", 2);



LinkedHashMap<String,Integer> dd= new LinkedHashMap<>(map);

        // Sort the HashMap by value
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

        // Create a new LinkedHashMap to store the sorted entries
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted HashMap
        System.out.println("Sorted HashMap: " + sortedMap);

    }


}
