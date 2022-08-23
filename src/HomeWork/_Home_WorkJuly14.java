package HomeWork;

import java.util.Scanner;

public class _Home_WorkJuly14 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a number.
        //Find the sum of all the even numbers between 0 to that number (included)
        //Find the sum of all the odd numbers between 0 to that number (included)
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number please");
        int num =sc.nextInt();
        int even=0;
        int odd=0;

        for (int R=1;R<=num;R++){
            if (R%2==0){
                even=even+R;
            }
            if (R%2==1){
                odd=odd+R;

            }
        }
        System.out.println("sum of even: "+even);
        System.out.println("sum of odd: " +odd);

    }
}
