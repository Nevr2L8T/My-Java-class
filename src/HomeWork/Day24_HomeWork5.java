package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Day24_HomeWork5 {
    /*Write a method where it takes ArrayList of Strings  and the index, returns to the element of that index in the ArrayList*/
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList("bread","milk","sugar","tea"));
        System.out.println(arrList);
        System.out.println(arrList.get(3));
    }
}
