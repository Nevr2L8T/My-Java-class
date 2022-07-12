package Day_9_Strings;

import java.util.Scanner;

public class Home_work_3_july14 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a number.
        //Find the sum of all the even numbers between 0 to that number (included)
        //Find the sum of all the odd numbers between 0 to that number (included)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please");
        int in = sc.nextInt();
        int even =0;
        int odd = 0;

        for (int j=0; j<=in; j++){
            if (j % 2==0){
                even +=j;

            }else if (j%2!=0){
                odd+=j;
            }

        }
        System.out.println(even);
        System.out.println(odd);


    }
}
