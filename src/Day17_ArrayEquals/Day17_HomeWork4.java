package Day17_ArrayEquals;

import java.util.Arrays;
import java.util.Scanner;

public class Day17_HomeWork4 {
    public static void main(String[] args) {
        /*Write a code where user is asked to enter a number to between 1 to 7 to get the name of the day of the week.User Array
ex. When user enters 1 you should print (Monday) */
        String [] str ={"Sunday","Monday","tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
        System.out.println("Enter a number from 1-7 please");
        int week= sc.nextInt();




        System.out.println(str[week-1]);
        break;
        }


    }
}
