package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Day24_HomeWork2 {
    /*ite a Method where it takes an Integer of ArrayList and returns to an Integer ArrayList where it contains only unique numbers
ex:   list==>   {1,1,2,3,3,4,5,6}
      uniques   ==>   {2,4,5,6}*/
    public static void main(String[] args) {
        ArrayList<Integer> arLis = new ArrayList<Integer>();
        arLis.addAll(Arrays.asList(4,8,6,7,4,5,2,3,0,9,2));
        arLis.removeAll(Arrays.asList(4,2));
        System.out.println(arLis);
    }
}
