package Day_7_Switch_Scanner;

import java.util.Scanner;

public class Topic6_Scanners {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        byte byteNumber = sc.nextByte();
        System.out.println("the byteNumber is:"+byteNumber);

        System.out.println("enter a intager");
        int intvalue = sc.nextInt();
        System.out.println("the intnumber is"+ intvalue);


    }
}
