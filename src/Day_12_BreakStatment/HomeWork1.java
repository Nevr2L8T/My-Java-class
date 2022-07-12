package Day_12_BreakStatment;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //- Write a code where user is asked to enter a integer number
        //- print all the numbers that can NOT be divided by 2, or 5 and Also can be divided by 7 between 1 to entered number(included) (use the Continue Statement)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please");

        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i%2==0 || i%5==0){
                continue;
            }else if (i%7!=0){
                continue;
            }
            System.out.println(i);

        }

    }
}
