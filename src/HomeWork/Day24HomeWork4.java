package HomeWork;

import java.util.ArrayList;

public class Day24HomeWork4 {

/*Write a Method where it takes String and return ArrayList of All the numbers in the String
ex: String str = "This234 is ju3st St1in6"
 srrLsit = {2,3,4,3,1,6}
hint in order to check if Character is a number or not ( boolean check = Character.isDigit(str.charAt(i) )*/

    public static void main(String[] args) {
        ArrayList<String> jusNum = new ArrayList<String>();
        String jusStr = "He110 Wor16";
        char [] arr = jusStr.toCharArray();
        for (int i = 0; i < jusStr.length(); i++) {
            boolean check = Character.isDigit(jusStr.charAt(i));
            if (check==true){
                jusNum.add(String.valueOf(arr[i]));
            }

        }
            System.out.println(jusNum);
    }

}
