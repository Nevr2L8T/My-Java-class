package day14NestedForLoops;

public class Topic5_BreakStatment {
    public static void main(String[] args) {

        for (int i = 0; i <3 ; i++) {
            System.out.println("from the outer loop i value"+i);
            for (int j = 0; j <3 ; j++) {
                if (j==2){
                    break;
                }
                System.out.println("             from the inner loop j value"+j);

            }

        }
        System.out.println("*********************************************");
        for (int i = 0; i <3 ; i++) {
            System.out.println("from the outer loop i value"+i);
            for (int j = 0; j <4 ; j++) {
                if (j==2){
                    continue;
                }
                System.out.println("             from the inner loop j value"+j);

            }
            int l =0;
            while (l<4){
                if (i==2){
                    l++;
                    continue;
                }
                System.out.println("           from the inner loop"+l);
                l++;
            }

        }
    }
}
