package Day17_ArrayEquals;

import java.util.Arrays;

public class Topic4_ArrayStringCharMethod {
    public static void main(String[] args) {
        //String name ="ziyaYilmaz";
        //name.toCharArray() ---> this will get all  the chars in the name1 string

        String name1 = "kubragulay";
        char [] chararr = name1.toCharArray();
        System.out.println("the char array is: "+ Arrays.toString(chararr));
        System.out.println("*************************************************");

        String name2 = "bahar Rachel";
        char [] chararr2 = name2.toCharArray();
        System.out.println("this is the second array"+Arrays.toString(chararr2));
    }
}
