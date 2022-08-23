package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Day16_HomeWork {
    public static void main(String[] args) {
        /*//Write   a   program   that   creates   an   array   of   10   elements   size.
//   Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then   display   the   sum   of   all
array   elements.*/
        System.out.println("Enter the number 10 please");
        Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int cat[] = new int[size];
        int sum=0;
        System.out.print("Enter 10 elements one by one:\n" );
        for (int i = 0; i <size ; i++)
        {
            cat[i]=sc.nextInt();
            sum=sum+cat[i];

        }
        System.out.println("The elements of the array are: "+Arrays.toString(cat));
        System.out.println("The sum is: "+sum);
    }
}
