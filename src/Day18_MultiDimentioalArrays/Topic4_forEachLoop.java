package Day18_MultiDimentioalArrays;

public class Topic4_forEachLoop {
    public static void main(String[] args) {
        // the for each loop is used when we don't know the starting point, but we want to iterate over all
        //elements and conditions
        int [] nums = {9,4,5,6,7,};


        // for (data types with variable: collection name){
        //}
        for (int var:nums
             ) {
            System.out.print(var);
            
        }
        System.out.println("********************************");
        String [] animals = {"horse","dog","pig"};

        for (String animal:animals){
            System.out.println(animal);
        }

    }
}
