package Day17_ArrayEquals;

import java.util.Locale;
import java.util.Scanner;

public class Day17_HomeWork5 {
    public static void main(String[] args) {
        /*Write a code where user enters a sentence.
         Find how many of those words contains the "da"(ignore the case) and
          print the word if it contains "da"(ignore the case)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence please ");
        String str =sc.nextLine();
        String pink = str.toLowerCase();
        String [] blue = pink.split(" ");

        int num = 0;
        System.out.println("The words that contain da: or DA: ");

        for (int i = 0; i <blue.length ; i++) {
            if (blue[i].contains("da")|| blue[i].contains("DA")){
                num++;
                System.out.println(blue[i]);
            }

        }
        System.out.println("The total amount is: "+num);


    }
}
