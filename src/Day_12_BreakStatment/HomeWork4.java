package Day_12_BreakStatment;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        //Write a code where the the user is asked to enter an integer number
        //- sum of all the odd numbers between 1 to given number (included) but exclude the 9,11,23,35 from the total sum if those numbers happens to be in the range of 1 to given number.
        //- The sum should not exceed 300
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=number ; i+=2) {

            if (i==9 ||i==11 ||i==23 ||i==35){
                continue;

            }
            else {
                System.out.print(i+" ");
            }
            if (sum+i<=300){
                sum+=i;
            }
        }
        System.out.println("\nThe sum is: " +sum);



    }
}
