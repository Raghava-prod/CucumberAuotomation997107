package test.sampleModules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatingString {

    public static String name = "NonStatic. can be accessed by Static and NonStatic";

    public static void main(String[] args) {
        String[] words = name.toLowerCase().split("\\W+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {

            if (map.keySet().contains(word)) {

                map.put(word, map.get(word) + 1);
               // map.put(word, map.getOrDefault(word,0) + 1);

            } else {
                map.put(word, 1);
            }


        }
        System.out.println(map);


        for(String key: map.keySet()){
            System.out.println(key +":" + map.get(key));
        }
    }
}
