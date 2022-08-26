package Day19_Methods;

public class Topic3_NestedForEach3 {
    public static void main(String[] args) {
        int [][][] array3 = {{{56},{78,98,9,23},{93,24,56}}, {{89,98,23}},{{87,45,6},{0,1}},{{90,23,4},{1,2},{45,6}}};

        int a1 = array3[3][0][0];
        System.out.println("the value of a: "+a1);

        for (int [][] arr2:array3){
            for (int [] arr1:arr2){
                for (int a:arr1){
                    System.out.println("the values: "+a);
                }
            }
        }

    }
}
