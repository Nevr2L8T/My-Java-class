package Labs;
  //(String) Reverse
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA

import java.util.Scanner;

public class Lab01 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a word please");
                String  rev = "";
                String blue = sc.nextLine();

                for (int i =blue.length()-1; i >=0 ; i--) {
                    rev=rev+blue.charAt(i);

                }
                    System.out.println(rev);
            }

}





