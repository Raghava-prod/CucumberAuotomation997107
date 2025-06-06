package test.sampleModules;

import org.testng.annotations.Test;

public class reverseString {
//Palindrome
    public static String a="Radar";
    public static String b="";


    public static void main(String[] args){

        for(int i=a.length()-1;i>=0;--i){
            b= b+a.charAt(i);

        }
        if(a.toLowerCase().equals(b.toLowerCase()))
        System.out.print(b);
    }

}
