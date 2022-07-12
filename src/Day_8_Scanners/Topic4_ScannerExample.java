package Day_8_Scanners;

import java.util.Scanner;

public class Topic4_ScannerExample {
    public static void main(String[] args) {
        // lets create a calculator
        //
        //
        //
        Scanner cal = new Scanner(System.in);
        System.out.println("welcome to calculator");
        System.out.println("please enter the first number");

        int firstNumber = cal.nextInt();
        System.out.println("please enter second number");

        int secondNumber = cal.nextInt();
        System.out.println("1) select 1 for multiplication\n2)select 2 for division\n3) select 3 for addition\n4)select 4 for subtraction");
        int operation = cal.nextInt();

    }
}
