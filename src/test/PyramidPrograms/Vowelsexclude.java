package test.PyramidPrograms;

public class Vowelsexclude {

    public static String name="Raghavendra".toLowerCase();
    public static   StringBuilder vowels = new StringBuilder();
    public static   StringBuilder Non_vowels = new StringBuilder();
    public static void main(String[] args){
       for(char b: name.toCharArray()){
           if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u'){

               vowels.append(b);
           }
           else
               Non_vowels.append(b);
       }




System.out.println(vowels);
       System.out.println(Non_vowels);
    }


}
