package Day_8_Scanners;

import java.util.Scanner;

public class Day8_Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Check to see if the number is positive, negative, or zero.

        System.out.println(" Enter a number please. ");
        int number;
        number = sc.nextInt();

        if (number>0){
            System.out.println(" The number is positive: "+number);
        }else if (number<0){
            System.out.println(" THe number is negative: "+number);
        }else {
            System.out.println(" The number is zero: "+number);
        }


    }
}

