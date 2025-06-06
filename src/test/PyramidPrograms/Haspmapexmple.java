package test.PyramidPrograms;

import java.util.HashMap;
import java.util.Map;

public class Haspmapexmple {

    public static void main(String[] args){
        HashMap<String,String> UIDta = new HashMap<>();
        HashMap<String,String> map = new HashMap<>();

        for(Map.Entry<String,String> ent: map.entrySet()){
String column = ent.getKey();
String value = ent.getValue();
if(UIDta.containsKey(column)){
    if(UIDta.get(column).equals(value)){

    }
}
        }
    }
}
