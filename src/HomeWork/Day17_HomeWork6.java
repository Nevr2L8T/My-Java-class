package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Day17_HomeWork6 {
    public static void main(String[] args) {
        /*Write a code where user is asked to enter a sentence,
         find how many of the character 'a'(ignore the case) is in the sentence and
          where is the index of that specific 'a' in the sentence.
          ex. "A cat was found on the street of Nashville"
        answer:
        "A" is in index of 0,
        "a" is in index of 3.
        "a" is in index of 7.
        "a" is in index of 23.
        Count of "a"s is : 4*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence please");
        String pup = sc.nextLine();
        char [] str = pup.toCharArray();


        for (int i = 0; i < str.length; i++) {
            if (str[i]=='a' || str[i]=='A'){
                System.out.println(pup.toCharArray()[i]+" is index of :"+i);

            }


        }



    }
}
