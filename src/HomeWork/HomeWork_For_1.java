package HomeWork;

import java.util.Scanner;

public class HomeWork_For_1 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a number and check for every number
        // between 0 to that number to see how many number between 0 to that number can be divided to 3 and 5 and sum all those number, Print the result
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please");
        int x = sc.nextInt();
        int num =0;




        for (int i=0; i<=x;i++){
            if (i%3==0 && i%5==0){
                x=x+i;

            }
            System.out.println(x);
        }



    }}