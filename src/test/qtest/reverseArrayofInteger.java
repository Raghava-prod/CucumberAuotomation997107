package test.qtest;

public class reverseArrayofInteger {

    public static void main(String[] args){
        int[] num = {1,2,3,4,7,8,9};
        int j=0;
        int temp=0;
        for(int i=num.length-1;i>=j;i--){
            temp=num[j];
            num[j]=num[i];
            num[i]=temp;
            j++;
        }

        for(int k:num){
            System.out.print(k+" ");
        }



    }

}
