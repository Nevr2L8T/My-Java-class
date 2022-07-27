package day14NestedForLoops;

public class Topic6_BreakContaforOuter {
    public static void main(String[] args) {

        hawre:
        for (int i = 0; i < 3; i++) {
            System.out.println("the outer loop value i"+i);
            for (int j = 0; j < 3; j++) {
                if (j==2){
                    break hawre;
                }
                System.out.println("             from the inner loop"+j);

            }

        }
        System.out.println("**********************************************");

        ozan:
        for (int i = 0; i < 3; i++) {
            System.out.println("the outer loop value i:    "+i);
            for (int j = 0; j < 3; j++) {
                if (i==2){
                    continue ozan;
                }
                System.out.println("             from the inner loop"+j);

            }

        }
    }
}
