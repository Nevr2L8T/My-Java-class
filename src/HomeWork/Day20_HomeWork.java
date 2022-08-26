package HomeWork;
/*Write a method that takes the day as an integer such as (1 for Monday, 2 for Tuesday, and so on)
 and it returns a String value indicating "Go To Work" for weekdays and "Go Back to Sleep" weekends.
 Name your Method as (GotoSleeporWork)*/

import java.util.Scanner;

public class Day20_HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What am I doing today? ");
        System.out.println("Enter a number please: 1) Monday: 2) Tuesday: 3) Wednesday: 4) Thursday: 5) Friday: 6) Saturday 7) Sunday:");
        int day = sc.nextInt();
        String schedule =days(day);
        System.out.println(schedule);

    }
    public static String days (int X){
        String schedule ;

        if (X >=0 && X <6){
            schedule = "Time to work:";
        }
        else if(X>=6 || X<8){
            schedule = "Time to sleep:";
        }
        else {
            schedule = "invalid";

        }
        return schedule;
    }
}
