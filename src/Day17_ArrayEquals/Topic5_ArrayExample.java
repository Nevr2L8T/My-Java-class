package Day17_ArrayEquals;

import java.util.Arrays;

public class Topic5_ArrayExample {
    public static void main(String[] args) {
        // write a code where it will get all the words in a string and put in to an array
        //then lets reverse the words

        String ex = "Tracy is cool";
        String [] exArr = ex.split(" ");
        System.out.println("the array "+ Arrays.toString(exArr));


        String [] reverse = new String[exArr.length];
        int k=0;
        for (int i = exArr.length -1; i >=0; i--) {
            reverse[k] =exArr[i];
            k++;
            
        }
        System.out.println("the reversr array is "+Arrays.toString(reverse));
        System.out.println("the original array is "+Arrays.toString(exArr));

        String reversest = "";
        for (int i = 0; i < reverse.length; i++) {
            reversest=reversest+reverse[i]+" ";

        }
        reversest=reversest.trim();

        System.out.println("the reverse string is "+reversest);

    }
}
