package Day_13_WhileLoop;

import java.util.Scanner;

public class WhileLoopContEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.println("please select the operation: 1 for add 2 for sub 3 for multi 4 for div");
        int con= sc.nextInt();
        while (true) {
            if (con==1){
                System.out.println("please enter first number");
                double num1 = sc.nextDouble();
                System.out.println("please enter second number");
                double num2 = sc.nextDouble();
                System.out.println("the result is "+(num1+num2));
            }else if (con==2){
                System.out.println("please enter first number");
                double num1 = sc.nextDouble();
                System.out.println("please enter second number");
                double num2 = sc.nextDouble();
                System.out.println("the result is "+(num1-num2));
            }
            else if(con==3){
                System.out.println("please enter first number");
                double num1 = sc.nextDouble();
                System.out.println("please enter second number");
                double num2 = sc.nextDouble();
                System.out.println("the result is "+(num1*num2));
            }
            else if (con==4){
                System.out.println("please enter first number");
                double num1 = sc.nextDouble();
                System.out.println("please enter second number");
                double num2 = sc.nextDouble();
                System.out.println("the result is "+(num1/num2));
            }
            else {
                break;
            }
            System.out.println("please select the operation: 1 for add 2 for sub 3 for multi 4 for div");
             con= sc.nextInt();

        }
        System.out.println("you exited the calculator");
    }
}
