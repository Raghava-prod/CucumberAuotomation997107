package test.qtest;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharRemoval {
//
    public static String ch= "hackereeearth".toLowerCase();

    public static void main(String[] args){
        List<Character> Duplicate = new ArrayList<>();
        List<Character> NonDuplicate = new ArrayList<>();

        for(char a:ch.toCharArray()){
            if(NonDuplicate.contains(a)){
                if(!Duplicate.contains(a)){
                    Duplicate.add(a);

                }
            }
            else{
                NonDuplicate.add(a);
            }
        }

        System.out.println(Duplicate);

    }
}
