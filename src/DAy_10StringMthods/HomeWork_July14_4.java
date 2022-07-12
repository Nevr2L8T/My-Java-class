package DAy_10StringMthods;

import java.util.Scanner;

public class HomeWork_July14_4 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a number:
        //Calculate the square of all the numbers from 0 to given number and print the result for each number, (square of a number is number*number == > 5*5 = 25 or 6*6 = 36
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number please. ");
        int num = sc.nextInt();
        int number;
        int square;
        square=num*num;
        System.out.println("the square of the number is "+num+"="+square);


    }
}
