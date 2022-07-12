package Day_13_WhileLoop;

public class Topic6_DoWhileExample {
    public static void main(String[] args) {

        int i=0;
        int total = 0;

        do {
            if (i==78){
                i+=2;
                continue;
            }
            if (i==100){
                break;
            }
            total=total+i;
            i=i+2;
        }while (i<=100);
        System.out.println("sum of all even numbers is"+total);


    }
}
