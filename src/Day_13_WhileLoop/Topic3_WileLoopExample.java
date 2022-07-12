package Day_13_WhileLoop;

import java.util.Scanner;

public class Topic3_WileLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********welcome to the calculator");
        System.out.println("Please select 1: fpr add 2: for sub 3: for multi 4: for div");
        int i = sc.nextInt();

        while (i==1 || i==2 || i==3 || i==4 ){
            System.out.println("enter the first number");
            double num1 = sc.nextDouble();
            System.out.println("enter the second number ");
            double num2 = sc.nextInt();
            if (i == 1) {
                double result = num1+num2;
                System.out.println("the result is "+result);
            }
           else if (i== 2){
                double result = num1-num2;
                System.out.println("the esult is"+result);
            }
           else if(i == 3){
                double result = num1*num2;
                System.out.println("the result is"+result);
            }
           else if (i== 4){
                double result = num1/num2;
                System.out.println("the result is"+result);
            }
           else {
               break;

            }
            System.out.println("Please select 1: fpr add 2: for sub 3: for multi 4: for div");
            i=sc.nextInt();

        }

    }
}
