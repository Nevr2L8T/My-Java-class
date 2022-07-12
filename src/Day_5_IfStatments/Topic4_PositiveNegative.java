package Day_5_IfStatments;

public class Topic4_PositiveNegative {
    public static void main(String[] args) {

        // we want to check if the number is positive, negative, or zero
        int number = 0;

        if (number>0){
            System.out.println(" the number:" + number);
            System.out.println(" the number"+number+ "is positive");
        }
        if (number<0){
            System.out.println("the number " + number+ "is negative");
        }
        if (number == 0){
            System.out.println("the number " + number+ "is zero");
        }

    }
}
