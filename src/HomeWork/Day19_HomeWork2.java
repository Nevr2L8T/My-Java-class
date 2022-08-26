package HomeWork;

import java.util.Arrays;
/*Write a method where it takes array of integers and returns the sorted version of that array */

public class Day19_HomeWork2 {
    public static void main(String[] args) {

        int [] arrSort = {23,43,1,95,-34,67,22};
        Sort(arrSort);
        System.out.println(Arrays.toString(arrSort));
    }
    public static void Sort(int [] a){
        Arrays.sort(a);
        int[] Sort =a;

    }


}
