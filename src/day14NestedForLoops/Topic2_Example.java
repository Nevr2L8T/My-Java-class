package day14NestedForLoops;

public class Topic2_Example {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.println("          from the otter loop==> I value"+i);
            for (int j = 1; j <=5 ; j++) {
                System.out.println("            from the inner loop ==> J value"+j);
                for (int k =1;k<=5; k++){
                    System.out.println("                    from the inner loop ==> k value"+k);
                }

            }

        }
    }
}
