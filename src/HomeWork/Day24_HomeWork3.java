package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day24_HomeWork3 {
    /*Write methods where it takes the ArrayList of Double
1) first method returns to max number
2) second metod returns to min number
3) third Method prints all element one by one on the same line ( ex = the List is: 100.9, 12.45, 30.46 )*/
    public static void main(String[] args) {
        ArrayList<Double> aList = new ArrayList<Double>();
        aList.addAll(Arrays.asList(2.4,67.2,12.3,89.7));
        System.out.println("Maximum number is: " +Collections.max(aList));
        System.out.println("Minimum number is:  "+ Collections.min(aList));
        System.out.println("All elements combined: "+ aList);
    }
}
