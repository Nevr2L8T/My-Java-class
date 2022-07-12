package Day_8_Scanners;

import java.util.Scanner;

public class Day8_Homework5 {
    public static void main(String[] args) {
        // Homework five.
        // Write a revenue program, enter quantity sold and the price of each product.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter quantity:");
        int quantity = input.nextInt();

        System.out.println("Please enter price:");
        double price = input.nextDouble();

        System.out.println("Total price is: "+quantity*price);

    }
}
