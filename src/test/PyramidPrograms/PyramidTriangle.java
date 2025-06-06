package test.PyramidPrograms;

public class PyramidTriangle {

    public static void main(String[] args){
        int rows=5;
        int temp = rows;
        int a=rows;
        boolean b = true;
        for(int i=rows;i>=1;--i){

            for(int k=temp;k>=1;k--){
                System.out.print(" ");
            }
            temp--;

            for(int j=a;j>=i;--j){
                System.out.print("*");
                b =true;
            }
            if(b) {
                a +=1;
                b =false;
            }


            System.out.println("");
        }
    }
}
