package HomeWork;

import java.util.Scanner;

public class Day17_HomeWork1 {
    public static void main(String[] args) {
        /*rite a code where it asks user to enter a Sentence, Find the longest word in the sentence and print it with the length of it.
        ex. ,"I love being outside with my dog, but I have a lot to do today"
       answer: Outside and the length is 7 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence please ");
        String str = sc.nextLine();
        String [] fish= str.split( " ");

        String longestWord=" ";
         longestWord =fish[0];

        int length =0;


        for (int i = 0; i <fish.length; i++) {
            if (longestWord.length()<fish[i].length()){
                longestWord=fish[i];
            int In = longestWord.length();
                length=In;
            }


        }

        System.out.println("The longest word is:  "+longestWord);
        System.out.println("The longest length is:  "+length);


    }
}
