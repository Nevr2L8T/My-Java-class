package day14NestedForLoops;

public class Topic4_WhileNestedLoops {
    public static void main(String[] args) {

    int i =0;
    while (i<2){
        System.out.println("from the outer loop i value"+i);

        int j=0;
        while (j < 2) {

            System.out.println("               from the inner loop j value"+j);
            j++;
        }
        i++;
    }
    int k = 0;
    while (k<3){
        System.out.println("from the while loop, outer loop the k value"+k);
        for (int l = 0; l < 3; l++) {
            System.out.println("             from inner for loop l value"+l);
            
        }
        k++;
    }
        System.out.println("*********************************************************");
        for (int j = 0; j <3 ; j++) {
            System.out.println("however  from for loop");
            int f=0;
            while (f<2){
                System.out.println("                  whatever: while loop  ");
                f++;
            }


        }
    }
}
