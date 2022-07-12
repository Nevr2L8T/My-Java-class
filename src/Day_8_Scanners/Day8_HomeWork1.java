package Day_8_Scanners;

import java.util.Scanner;

public class Day8_HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating a calculator
        System.out.println( " Let's make a calculator! ");
        System.out.println(" Please enter first number. ");
        int numberA = sc.nextInt();
        System.out.println(" Please enter second number. ");
        int numberB = sc.nextInt();
        System.out.println(" Almost there!!! ");
        System.out.println(" Please select from the following operations. ");
        System.out.println("\n1: Addition \n2: Subtraction \n3: Multiplication \n4: Division \n5: Modulus");
        int option = sc.nextInt();
        int result = 0;

        if (option==1){
            result = numberA+numberB;
            System.out.println(" The answer using addition is: "+result);
        }
        else if (option==2){
            result = numberA - numberB;
            System.out.println(" The answer using subtraction is:"+result);
        }
        else  if (option==3){
            result = numberA* numberB;
            System.out.println(" The answer using multiplication is: "+result);
        }
        else if (option==4){
            result = numberA/ numberB;
            System.out.println(" The answer using division is:"+result);
        }
        else if (option==5){
            result = numberA % numberB;
            System.out.println(" The answer using modulus is:"+result);
        }
        else{
            System.out.println(" please enter a number between 1-5");
        }




}}
