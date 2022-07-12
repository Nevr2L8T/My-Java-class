package Day_6_IfElseCont;

public class Topic6_NestedIfStatments {
    public static void main(String[] args) {


        // Nested if statements

        // if number is zero just print
        //if the number is even less than 50 double it
        // if the number is odd and less than 70 triple it

        int number  =72;
        if (number == 0){
            System.out.println("the number is:"+number);
        }else if (number % 2==0){
            if (number<50){
                number = number*2;
            }
            else{
                number= number*4;
            }
        }
        else {
            if (number<70){
                number=number*3;
            }
            else {
                number = number*6;

            }
        }
        System.out.println(number);


    }
}
