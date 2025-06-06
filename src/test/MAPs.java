package test;

import java.util.HashMap;

public class MAPs {
    public static void main(String[] args) {
        // Input string


        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through the words and count their occurrences
        // Print the word counts
        wordCountMap.put("selenium",1);
        wordCountMap.put("is",1);
        wordCountMap.put("selenium",2);
        wordCountMap.put("testng",1);

        for(String value: wordCountMap.keySet()){

            System.out.println("key: " +value);

    }
    }


}
