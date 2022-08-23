package HomeWork;

import java.util.Arrays;
import java.util.Scanner;
//Write a code where it ask user to enter a Sentence, Find the longest word in the sentence and print it with the length of it.
//ex. ,"I love being outside with my dog but I have a lot to do today"
//answer: Outside and the length is 7

public class HomeWorkDay17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a sentence please ");
        String bee = sc.nextLine();
        int longestlength = 0;
        String longestword = " ";


        for (String fly: bee.split(" ")){
            if (longestword.length()==0){
               longestlength =fly.length();
                longestword=fly;
            } else if (fly.length()>=longestlength) {
                longestlength= fly.length();
                longestword=fly;

            }
        }
        sc.close();
        System.out.println("The longest word "+longestword);
        System.out.println("Length of word "+longestlength);

    }
}
