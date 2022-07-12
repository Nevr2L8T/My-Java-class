package Day_8_Scanners;

import java.util.Scanner;

public class Day8_HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter first number ");
        int number1 = scanner.nextInt();
        System.out.println(" Please enter second number ");
        int number2 = scanner.nextInt();
        System.out.println("Please enter third number ");
        int number3 = scanner.nextInt();

        if (number1>number2 && number1<number3){
            System.out.println("Number1 is the greatest number."+number1);
        }else if (number2>number3){
            System.out.println("Number2 is the greatest number."+number2);
        }else {
            System.out.println("Number3 is the greatest number. "+number3);
        }




    }
}
