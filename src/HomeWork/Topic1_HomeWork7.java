package HomeWork;

import java.util.Scanner;

public class Topic1_HomeWork7 {
    public static void main(String[] args) {
        /*//Write code where:
        //- User is asked to enter a string,
        //- Use that string to see how many of 3 character substring is Palindrome
        //- Print All the substring Palindrome Substrings
        //- Example of Substring: word ==> "banana" 3 characters Palindrome substrings are ==> "ana", "nan" "ana". Count is 3.
        //PS = This is a little hard question please give your best and make sure you only use the things we have learned so far.*/


        // how to get characters in a substring
        // banana  //ban // ana// nan// ana
        //orange===> ora// ran// ang// nge   the range is 0 lenghth -3 if I want a 3 char substring
         //lenghth -3

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a string ");
        String input = sc.next();
        int count = 0;

        for (int i = 0; i <= input.length()-3; i++) {

            String sub = input.substring(i,i+3);
           System.out.println("the substring is: " +sub);
            String reversesub = " ";

            for (int j = sub.length()-1; j >=0 ; j--) {
                reversesub=reversesub+sub.charAt(j);

            }
           if (reversesub.equals(sub)){
               count++;
               System.out.println("the p sub is: "+sub);
           }

        }
        System.out.println("the total count of p substring with 3 char: "+count);










    }
}
