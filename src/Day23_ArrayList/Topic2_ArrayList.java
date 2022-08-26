package Day23_ArrayList;

import java.util.ArrayList;

public class Topic2_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>  List1 = new ArrayList<>();
        List1.add(0);
        List1.add(2);
        List1.add(3);
        List1.add(5);
        List1.add(8);

        int num5 = List1.get(3);
        System.out.println(num5);
        for (int i = 0; i < List1.size(); i++) {
            System.out.println(i+ List1.get(i));

            ArrayList<Character> ch = new ArrayList<>();
            ch.add('g');
            ch.add('t');
            ch.add('i');
            ch.add('q');
            ch.add('b');

            int indx = ch.indexOf('q');
            System.out.println(indx);

            ArrayList<String> st = new ArrayList<>();

            st.add("eda");
            st.add("jason");
            st.add("raz");
            st.add("yaseen");
            st.add("seray");

            System.out.println(st);




        }

    }
}
