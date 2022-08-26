package Day23_ArrayList;

import java.util.ArrayList;

public class Topic3_ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> sh = new ArrayList<>();
        sh.add("Deniz");
        sh.add("gulay");
        sh.add("banu");
        System.out.println(sh);
        sh.remove(1);
        System.out.println(sh);

        sh.remove("banu");
        System.out.println(sh);
        ArrayList<Integer> in =new ArrayList<>();

        in.add(0);
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        System.out.println(in);

        in.remove(Integer.valueOf(2));
        System.out.println(in);


    }
}
