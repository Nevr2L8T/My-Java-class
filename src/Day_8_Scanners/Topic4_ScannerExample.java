package Day_8_Scanners;

import java.util.Scanner;

public class Topic4_ScannerExample {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        System.out.println("welcome to calculator");
        System.out.println("please enter the first number");
        int firstNumber = cal.nextInt();

        System.out.println("please enter second number");
        int secondNumber = cal.nextInt();

        System.out.println("1) select 1 for multiplication\n2) select 2 for division\n3) select 3 for addition\n4) select 4 for subtraction");
        int operation = cal.nextInt();

        switch (operation){
            case 1:
                int result = firstNumber*secondNumber;
                System.out.println("the result is"+result);
                break;
            case 2:
                double result2 = ((double) firstNumber/secondNumber);
                System.out.println("the result is"+result2);
                break;
            case 3:
                int result3 = firstNumber+secondNumber;
                System.out.println("the result is "+result3);
                break;
            case 4:
                int result4 = firstNumber-secondNumber;
                System.out.println("the result is"+result4);
                break;
            default:
                System.out.println("the peration is not valid");

        }


    }
}
