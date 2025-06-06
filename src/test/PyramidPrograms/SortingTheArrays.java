package test.PyramidPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingTheArrays {

        public static void main(String[] args) {
            int[] a = {5, 2, 8, 1,3,4,6,7, 9, 4}; // Example array

            // Sort the array in ascending order
            int temp=0;

for(int i=0;i<a.length;i++){
    for(int j=1+i;j<a.length;j++){
    if(a[i]>a[j]) {
        temp = a[j ];
        a[j] = a[i];
        a[i] = temp;    }



    }

}
for(int num: a) {
    System.out.print(num+" ");
}
        }

}
