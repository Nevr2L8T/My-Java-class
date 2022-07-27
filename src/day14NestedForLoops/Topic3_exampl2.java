package day14NestedForLoops;

public class Topic3_exampl2 {
    public static void main(String[] args) {

        // Stairs in numbers

        for (int i = 7; i >=0; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print(j+"");

            }
            System.out.println();
        }

        for (int i = 0; i <7; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(". ");


            }
            System.out.println();
        }
    }
}
