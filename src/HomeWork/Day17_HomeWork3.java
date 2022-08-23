package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Day17_HomeWork3 {
    public static void main(String[] args) {
        /*rite a code where user is asked to enter 10 numbers and store those number in the integer array.
         Print  the max number and all the element in the array(Yo can use Arrays.toString() method)*/

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int max = num[0];
        System.out.println("Enter ten numbers please. ");

        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            num[i] = x;
        }
        for (int j = 0; j < num.length; j++) {
            if (max < num[j]) {
                max = num[j];
            }
        }
        System.out.print(Arrays.toString(num)+" The maximum number is: "+max);






    }
}

