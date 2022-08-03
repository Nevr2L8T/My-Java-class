package Day16_ArraysCont;

import java.util.Arrays;

public class Day16_Homework_4 {
    public static void main(String[] args) {
        /*Write code where it shifts all the elements in array by one index and put the the first index at the end of the array
         //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}

         */


        int [] red = new int[] {2,3,4,5,6,7,8,9,};
        int times =1;
            System.out.println("first Array");

        for (int i = 0; i < red.length; i++) {
            System.out.print(red[i]+" ");
        }
        for (int i = 0; i < times; i++) {
            int j,store;
            store=red[0];

            for ( j = 0; j < red.length-1 ; j++) {
                red[j]=red[j+1];
            }
            red[j]=store;
        }
        System.out.println();
        System.out.println("after shifting");
        for (int i = 0; i < red.length; i++) {
            System.out.print(red[i]+" ");

        }

        }

    }












