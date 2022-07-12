package Day_8_Scanners;

import java.util.Scanner;

public class Topic3_NextLine {
    public static void main(String[] args) {
        Scanner Fullname = new Scanner(System.in);
        System.out.println("enter full name");

        String name = Fullname.nextLine();
        System.out.println("the full name is:"+name);



    }
}
