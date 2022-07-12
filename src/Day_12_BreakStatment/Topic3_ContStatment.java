package Day_12_BreakStatment;

public class Topic3_ContStatment {
    public static void main(String[] args) {
        // if you run your code and it contaiins cont it will pass that iteration int for loop
        for (int i= 0;i<10;i++){
            if (i==3 || i==6 || i==9){

            continue;//it will skip the iteration
            }
            System.out.println(i);
        }
    }
}
