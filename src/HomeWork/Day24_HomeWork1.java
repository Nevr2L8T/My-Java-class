package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Day24_HomeWork1 {
    //Write a method where it takes 2 String arrays and returns to an ArrayList where it contains all of the elements of the Arrays
    //arr1   =   {"A",   "B",   "C"};
    //arr2   =   {"D",   "E",   "F",   "G"};
    //ist   ==>   {"A",   "B",   "C",   "D",   "E",   "F",   "G"}    */
    public static void main(String[] args) {

        String[] arr1 = {"H","E","L","L","O"};
        String[] arr2 = {"W","O","R","L","D"};

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(Arrays.asList(arr1));
        strList.addAll(Arrays.asList(arr2));

        System.out.println(strList);


    }
}
