package Day23_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Topic4_ArrayListExamp {
    public static ArrayList<String> name(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            String nam = arr.get(i);
            arr.remove(nam);
            if (arr.indexOf(nam)== -1){
                arr.add(i,nam);

            }
            
        }return arr;


    }

    public static void main(String[] args) {
        ArrayList<String> stNames = new ArrayList<>();
        stNames.add("ziya");
        stNames.add("sam");
        stNames.add("ozan");
        stNames.add("sevgi");
        stNames.add("hhusein");
        stNames.add("ziya");
        name(stNames);
        System.out.println(stNames);



    }


}
