package test.PyramidPrograms;

public class chardemo {
    public static String a ="Raghavendra";
   public static StringBuilder builder = new StringBuilder();
    public static void main(String[] args){
        for(int i=a.length()-1;i>=0;i--){
            builder.append(a.charAt(i));
        }
        System.out.print(builder);
    }
}
