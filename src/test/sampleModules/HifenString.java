package test.sampleModules;

public class HifenString {
    public static String text ="Raghavendra";
    public static String text1="";
    public static String c= "";
    public static String reverese ="";
    public static void main(String[] args){
        for(int i=0;i<text.length();i++){

            text1= text1+text.charAt(i)+"-";

        }

        for(int j=0;j<text1.length()-1;j++){
            c= c+text1.charAt(j);
        }

        System.out.println(c);

        for(int k=c.length()-1;k>=0;--k){
            reverese= reverese+c.charAt(k);
        }
        System.out.println(reverese);
    }
}
