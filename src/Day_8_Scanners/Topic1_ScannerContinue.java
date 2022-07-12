package Day_8_Scanners;

import java.util.Scanner;

public class Topic1_ScannerContinue {
    public static void main(String[] args) {
        // we are creating a scanner object

        Scanner input = new Scanner(System.in);
        // short how to scan the short data type input
        System.out.println("please enter a short number");
        short sh = input.nextShort();
        System.out.println("the number user entered is " + sh);

        System.out.println("please enter a int number");
        int In = input.nextInt();
        System.out.println("the inter num is;"+In);

        System.out.println("please enter a double number");
        double Do = input.nextDouble();
        System.out.println("enter the double;"+Do);

        System.out.println("enter float number");
         float fl = input.nextFloat();
        System.out.println("this is the float number;"+fl);
        // the strings have 2 ways to be scanned


    }
}
