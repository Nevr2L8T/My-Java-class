package Day_8_Scanners;

import java.util.Scanner;

public class Day8_HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write a program that prints first and last name.

        System.out.println(" Please enter your first name. ");
        String firstName = sc.nextLine();
        System.out.println(" please enter your last name. ");
        String lastName = sc.nextLine();
        System.out.println(" Your full name is: " +firstName+"\t"+ lastName);


    }
}
