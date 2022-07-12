package Day_13_WhileLoop;

public class Topic2_WhileLoopCont {
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            System.out.println(i++);
           // i++;
        }
        System.out.println("******************");
        int j = 0;
        while (j<=10){
            if (j==8){
                j=j+2;
                continue;

            }
            System.out.println(j);
            j=j+2;
        }
        System.out.println("*****************************");
        int k = 0;

        while (k<=9){
            if (k==9){
                System.out.println(k);
                break;
            }
            System.out.println(k);
            k++;
        }
    }
}
