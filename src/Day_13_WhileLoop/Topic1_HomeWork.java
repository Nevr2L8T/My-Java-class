package Day_13_WhileLoop;

import java.util.Scanner;

public class Topic1_HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i<=num; i+=2) {

            if(sum+i<=390){
                sum=sum+i;

            }else {
                break;
            }

        }
        System.out.println(sum);

    }
}
