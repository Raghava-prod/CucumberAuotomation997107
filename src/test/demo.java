package test;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.HashMap;

public class demo {



        public static void main(String[] args) {
            // Input string
            String input = "Selenium is good. Selenium is powerful.";

            // Convert the string to lowercase and split into words
         //   String[] words = input.toLowerCase().replace(".","").split(" ");
            String[] words= input.toLowerCase().split("\\W+");

            // Create a HashMap to store word counts
            HashMap<String, Integer> wordCountMap = new HashMap<>();
          //  ArrayList<String> Addlist = new ArrayList<>();
           // int value=0;
//int i=1;
            // Iterate through the words and count their occurrences
            for (String word : words) {

                if(wordCountMap.containsKey(word)){
                // value = (wordCountMap.getOrDefault(word, 0)+1);
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0)+1);
               // Addlist.add(word+value);
            }
                else{
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0)+1 );
                 //   Addlist.add(word);
                }

                }

            // Print the word counts
            System.out.println("Word counts:");
            for (String key : wordCountMap.keySet()) {
                System.out.println(key + ": " + wordCountMap.get(key));
            }
        }


    }

