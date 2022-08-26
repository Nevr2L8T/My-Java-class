package Day23_ArrayList;

import java.util.ArrayList;

public class Topic1_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> Listname = new ArrayList<Integer>();
        Listname.add(90);
        Listname.add(80);
        Listname.add(84);
        Listname.add(85);
        Listname.add(93);
        Listname.add(90);
        System.out.println(Listname);
        Listname.add(3,45);
        System.out.println(Listname);
        Listname.add(7,100);
        System.out.println(Listname);
        Listname.add(8,20);
        System.out.println(Listname);

        int sz = Listname.size();
        System.out.println(sz);

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(List2.size(),90);
        List2.add(List2.size(),9);
        List2.add(List2.size(),98);
        List2.add(List2.size(),90);
        List2.add(List2.size(),2);


        System.out.println(List2);

    }


}
