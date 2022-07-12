package Day_8_Scanners;

import java.util.Scanner;

public class Topic2_NextandNextLine {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("put something on the console");

        String somthing = st.next();

        System.out.print("the thing you put is:"+somthing);
        System.out.print("enter something with space");
        String Butter = st.nextLine();
        System.out.print("the thing you enterd is:"+Butter);

    }
}
