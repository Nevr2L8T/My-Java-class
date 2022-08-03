package Day18_MultiDimentioalArrays;

import java.util.Arrays;

public class Topic3MultiArraysToString {
    public static void main(String[] args) {
        String [] Stnames = {"sam","rachael","sarp"};
        System.out.println(Arrays.toString(Stnames));

        String [] [] twoNames = {{"ziya","alan"},{"elif","racheal"}};
        System.out.println("the two dimension array: "+Arrays.toString(twoNames));
        System.out.println("the first array inside of the big array is: "+Arrays.toString(twoNames[0]));
        System.out.println("the first array inside of the big array is: "+Arrays.toString(twoNames[1]));

        //using Arrays.deepToString will allow you to convert all the items for multidimensional arrays
        System.out.println("all the items in the two dimensional arrays "+Arrays.deepToString(twoNames));

        int [][][] three = {{{8,5,4,5},{3,90}},{{34,78,90},{1}}};
        System.out.println(Arrays.deepToString(three));


    }
}
