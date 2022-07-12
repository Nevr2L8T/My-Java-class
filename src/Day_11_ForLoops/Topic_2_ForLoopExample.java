package Day_11_ForLoops;

public class Topic_2_ForLoopExample {

    //write a code that prints all the even numbers 0 - 100  (100 INCLUDED)
    public static void main(String[] args) {
        int total = 0;
        System.out.println("the even nubers");

        for (int i = 0 ; i <= 100;i++){
            if (i%2==0){
                System.out.print(" "+i);
            }
            total++;
        }
        int cevdet = 0;
        System.out.println("\n"+"total count of itaration:"+total);
        for (int j = 0; j<=100; j+=3){
            System.out.print(" "+j);
            cevdet++;
        }
        System.out.println("\n"+"the total iteration"+cevdet);
    }
}
