package test.qtest;

public class Seperatechar {

    public static String alpanum="ABF455NN1";

    public static void main(String[] args){

        String alpha = "";
        int num = 0;
        for(char c: alpanum.toCharArray()){
            if(Character.isDigit(c)){
                num=num+c;
            }
            else{
                alpha=alpha+c;

            }
        }
        System.out.println(alpha);
        System.out.println(num);
    }

}
