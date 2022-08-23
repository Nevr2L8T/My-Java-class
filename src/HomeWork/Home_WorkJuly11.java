package HomeWork;

import java.util.Scanner;

public class Home_WorkJuly11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name please.");
        String rachel = sc.nextLine();

        if (rachel.startsWith("A") && rachel.endsWith("L")){
            System.out.println(rachel.replace("A","B"));
        } else if (rachel.startsWith("B") && rachel.endsWith("L") && rachel.contains("A")) {
            System.out.println(rachel.replace(rachel.charAt(1),'G'));

        }else if (rachel.startsWith("C") || rachel.endsWith("K")){
            if (rachel.equals("Clark")){
                System.out.println("name is equal to Clark");
            }else if (rachel.equals("CLARK")){
                System.out.println("name is equal to CLARK");
            }else {
                System.out.println("not equal to");
            }
        }


    }
}
