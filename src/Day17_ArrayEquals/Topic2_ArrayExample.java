package Day17_ArrayEquals;

import java.util.Arrays;

public class Topic2_ArrayExample {
    public static void main(String[] args) {
        // adding 2 arrays into 1

        int [] arr1={2,3,4,5};
        int [] arr2 ={3,4,5,6,7};
        
        int size = arr1.length+arr2.length;
        
        int [] arr3 = new int[size];
        for (int i = 0; i < arr1.length ; i++) {
            arr3[i]=arr1[i];

            
        }
        int k=0;
        for (int i = arr1.length; i <size ; i++) {
            arr3[i] = arr2[k];
            k++;

        }
        System.out.println("arr3: "+ Arrays.toString(arr3));
    }
}
