package Day_12_BreakStatment;

public class Topic5_WhileLoop {
    public static void main(String[] args) {
        // the concept of while loop
        // we define the starting point before the "while"
        // you have the end point in the while(endpoint)
        // you have the iteration inside the curly brackets
        // 1) int = 0
        //2) while (condition i<10){
        //3)  i++ or i-- or i+=10 or
        //}

        for (int i=0;i<10;i++){
            System.out.print(" "+i);
        }
        System.out.println("\n"+"------------------------------------");
        int i=0;
        while (i<10){
            System.out.print(" "+i);
            i++;
        }
    }
}
