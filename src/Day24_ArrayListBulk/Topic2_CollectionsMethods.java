package Day24_ArrayListBulk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Topic2_CollectionsMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(90,45,67,23,12,67,89));
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(90,788,67,1234,65767,89));
        System.out.println(Collections.max(list2));

        System.out.println("*****************************************************");
        int min = Collections.min(list2);
        System.out.println(min);

        System.out.println(list2);

        Collections.swap(list2,1,3);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(90,55,788,67,1234,12,65636,89));
        Collections.replaceAll(list3,55,88);
        System.out.println(list3);

        ArrayList<String> stlist =new ArrayList<>();
        stlist.addAll(Arrays.asList("ziya","serbest","bahar"));

        String s = "ziya";
        Collections.replaceAll(stlist,"ziya","ozan");
        System.out.println(stlist);

        System.out.println(Collections.frequency(stlist,"ozan"));




    }
}
