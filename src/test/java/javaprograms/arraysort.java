package javaprograms;

public class arraysort {

    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 9, 4}; // Example array
        System.out.println(a);
        // Sort the array in ascending order
        int temp=0;

        for(int i=0;i<a.length;i++){
            for(int j=1+i;j<a.length;j++){
                if(a[i]>a[j]) {
                    temp = a[j ];
                    a[j] = a[i];
                    a[i] = temp;
                }



            }

        }
        System.out.println("hhhhhhhhh"+a);
    }
}
