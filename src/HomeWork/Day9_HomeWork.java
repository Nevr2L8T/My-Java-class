package HomeWork;

import java.util.Scanner;

public class Day9_HomeWork {
    public static void main(String[] args) {

        /*Write a code where user is asked to enter a name.
        * If the name starts with A and ends with L replace A with B and print the result.
        * If the name starts with B and ends with L also contains A replace the second character of the name with G.
        * If the name starts with C and ends with k check is the name equal to clark or CLARK  */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name please");

        String name = sc.nextLine();
        String name1 = "";

        if (name.startsWith("A")&& name.endsWith("L")){
            System.out.println(name.replace("A","B"+name));
        } else if (name.startsWith("B") && name.endsWith("L") && name.contains("A")) {
            System.out.println(name.replace(name.charAt(1),'G'));

        }
        if (name.startsWith("C") && name.endsWith("K") && name.equals("clark")|| name.equals("CLARK")){
            System.out.println("Name is equal to"+name);


        }else {
            System.out.println("name is equal to clark\t"+name);
        }


    }
}
