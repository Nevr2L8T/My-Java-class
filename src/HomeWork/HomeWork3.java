package HomeWork;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        // Write a code where user is asked to enter a number
        //- Print the even sum of the even numbers from 0 to entered number(included) but the Sum should not pass 390

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please. ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i+=2) {
            sum=sum+i;
            if (sum>=390){
                sum=sum-i;
                break;
            }
            System.out.println(i);
        }
                System.out.println(sum);



    }
}
