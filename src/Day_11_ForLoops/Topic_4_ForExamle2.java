package Day_11_ForLoops;

import java.util.Scanner;

public class Topic_4_ForExamle2 {
    public static void main(String[] args) {

        Scanner thor = new Scanner(System.in);
        System.out.println("Please enter a string");
        String FromScan = thor.next();

        for (int i = 0; i <FromScan.length(); i++){
            if (FromScan.charAt(i)=='A' || FromScan.charAt(i)=='a'){
                FromScan = FromScan.toUpperCase();
                System.out.println(FromScan);
            }
            else {
                FromScan = FromScan.toLowerCase();
            }
        }
        System.out.println(FromScan);
    }
}
