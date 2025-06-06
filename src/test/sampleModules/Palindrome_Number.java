package test.sampleModules;

public class Palindrome_Number {

    public static void main(String[] args){
        int n= 121;
        int r;
        int s=0;
        int t=n;
        while(n>0){
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        if(t==s)
            System.out.println("it is palindrome");
        else
            System.out.println("not a palindrome");
    }
}
