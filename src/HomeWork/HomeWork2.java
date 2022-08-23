package HomeWork;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        //- Write a code where user is asked to enter a string
        //- create a new string with entered string but do not include 'L' 'M', 'T' 'E' in the new string
        //- print the new string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string please");
        String blue = sc.nextLine();
        String result = "";
        for (int i = 0; i < blue.length(); i++) {
            if (blue.charAt(i) =='L'|| blue.charAt(i)=='M' || blue.charAt(i)=='T'|| blue.charAt(i)=='E'){
                continue;
            }
            result=result+blue.charAt(i);
        }
        System.out.println(result);
    }
}




