package test.sampleModules;

import java.util.ArrayList;
import java.util.List;

public class SeperateCharNum {

    public static void separateCharactersAndNumbers(String input) {
        List<Character> characters = new ArrayList<>();
        String num[]= input.split(" ");
        int sum = 0;
        String number="";

    for(String Char: num) {
        String text="";
        for (char c : Char.toCharArray()) {
            if (Character.isDigit(c)) {
                 text= text+c;

            } else if (Character.isLetter(c)) {
                characters.add(c);
            }
        }
        sum += Integer.parseInt(text);
    }

        System.out.println("Characters: " + characters);
        System.out.println("Sum of numbers: " + sum);
    }

    public static void main(String[] args) {
        String input = "ra1 dgd342 dgf21 ddh22";
        separateCharactersAndNumbers(input);
    }
}
