package Day24_ArrayListBulk;

import java.util.ArrayList;
import java.util.Arrays;

public class Topic1_BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>();
        list.add(4);
        System.out.println(list);

        list.addAll(Arrays.asList(1,2,3,4,5,2,1423));

        System.out.println(list);

        ArrayList<Integer> List1 = new ArrayList<>();
        Integer[] arr ={9,6,7,8,3,4,5,6,2,4};
        List1.addAll(Arrays.asList(arr));
        System.out.println(List1);
        System.out.println("*******************************************************");

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(34);
        System.out.println(List2.contains(34));

        List2.addAll(Arrays.asList(90,33,67,23,12,21,78,98));
        System.out.println(List2);

        boolean b = List2.containsAll(Arrays.asList(33,20,23,12));
        System.out.println(b);

        List2.removeAll(Arrays.asList(90,33,21));
        System.out.println(List2);

        System.out.println("***********************************************************");

        ArrayList<Integer> List4 = new ArrayList<>();
        List4.addAll(Arrays.asList(90,34,56,321,78,2,2,4,3,3,90));
        System.out.println(List4);
        List4.retainAll(Arrays.asList(2,3,90));
        System.out.println(List4);


    }
}
