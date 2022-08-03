package Day17_ArrayEquals;

import java.util.Arrays;

public class Topic6_ReverseArrayinPlace {
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,7,8,9,0,-12};

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }
        System.out.println("the reverse array "+ Arrays.toString(arr));

    }
}
