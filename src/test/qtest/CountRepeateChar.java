package test.qtest;

import java.util.HashMap;

public class CountRepeateChar {
    public static String text="AHDAJDENAHDKDANDNEAND1MDJANJ2EN";


    public static void main(String[] args){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: text.toCharArray()){
            if(map.keySet().contains(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }

        }

        for(char key:map.keySet()){
            System.out.println(key+":"+map.get(key));

        }


    }
}
