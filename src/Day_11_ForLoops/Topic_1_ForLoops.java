package Day_11_ForLoops;

public class Topic_1_ForLoops {
    public static void main(String[] args) {
        // for( starting point, endpoint, iteration{



        //write a for loop that increases by two for each iteration
        int count = 0;
        for (int i = 1; i<100; i+=2){
            System.out.println("the value of i "+i);
            count++;
        }
        System.out.println(count);
    }
}
