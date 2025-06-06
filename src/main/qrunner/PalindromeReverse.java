package main.qrunner;

public class PalindromeReverse {



    public static void main(String[] args) {

      String str = "sbsradardgd";
        int i=0;
        int starttime =0;
        int lasttime=0;
        int j= str.length()-1;
        while(j>=i){
           String b = ""+str.charAt(i);
            char letter = str.charAt(i);
            char lastletter= str.charAt(j);
            if(letter==lastletter){
                starttime=i;

            }
             i++;
            j--;
        }
    }
}
