package HomeWork.HomeWork;

public class Day6_HomeWork {
    public static void main(String[] args) {

         // Homework task 1:
        //Create a program that will check if a number is divisible by 2 and 5 at the same time.

        int number = 90;
        if (number %2==0 && number %5==0){
            System.out.println("Number is divisible by two and five "+number);
        }else {
            System.out.println("Number is not divisible by two and five"+number);
        }



        System.out.println("*****************************************************");
        // Homework task 2:
        // Write a program to find the largest among three numbers

        int number1 = 27;
        int number2 = 540;
        int number3 = 98;

        if (number1>number2 && number1>number3){
            System.out.println("This is the largest number:"+number1);
        }else if (number2>number1 && number2>number3){
            System.out.println("This is the largest number:"+number2);

        }else {
            System.out.println("This is the largest number");
        }

        System.out.println("*********************************************************");
        //Homework task 3:
        // Create a program to check weather the given number is positive or negative

        int Number4 = -54;
        if (Number4==0){
            System.out.println("This number is neither positive nor negative:"+Number4);
        }else if (Number4>0){
            System.out.println("This is a positive number"+Number4);
        }else {
            System.out.println("This is a negative number"+Number4 );
        }






}}
