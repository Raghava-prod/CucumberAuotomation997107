package test.sampleModules;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseStringUsingSet {
    public static void main(String[] args){
        int[] nums= {2,31,4,8,1,2,0,42,4,9};
        String[] str= new String[]{"dwad","dxw","wsw"};
        int nuwm = 4;
       List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<String> rr = Arrays.asList(str);

       Set<Integer> uniqueElements= new LinkedHashSet<>();

       for(int num: nums){

           uniqueElements.add(num);

       }
//       int i=1;
//       String s= String.valueOf(i);
//       int j= Integer.parseInt(s);
//       float f = 0.336333322331311F;

List<Integer> aa= new ArrayList<>();




       Integer[] nod = uniqueElements.toArray(new Integer[0]);
       for(int k: nod){
           aa.add(k);
       }
       Arrays.sort(nod);

       System.out.println(uniqueElements);

       int[] ui = Arrays.stream(nums).distinct().sorted().toArray();

       System.out.println(ui);

    }

}
