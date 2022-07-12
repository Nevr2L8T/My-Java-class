package DAy_10StringMthods;

import java.util.Scanner;

public class Topic2_Example {
    public static void main(String[] args) {
        // user is asked to put a valid email(username)
        // enter a password where the password is at least 9 char
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid email address");
        String email = sc.next();

        System.out.println("Please enter a password");
        String password = sc.next();

        String formatedemail = email.toLowerCase();

         if (formatedemail.length()> 10  &&formatedemail.contains("@gmail.com")&& formatedemail.endsWith("@gmail.com")){
             System.out.println("email is valid");
         }else {
             System.out.println("your email is not valid");
         }
         if (password.length()>=9){
             System.out.println("valid password");

         }else {
             System.out.println("invalid password");
         }

    }
}
