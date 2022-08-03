package Day17_ArrayEquals;

import java.util.Arrays;

public class Topic3_StringMethodsInArray {
    public static void main(String[] args) {
        String s = "ziya is instructor ";
        String [] name = s.split(" ");
        System.out.println("the array is: "+ Arrays.toString(name));
        System.out.println("********************************************");
        String ja ="Java is cool";
        String [] name2 = ja.split("");
        System.out.println("the other array is: "+Arrays.toString(name2));

    }
}
