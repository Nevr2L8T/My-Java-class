package Day_4_Operators;

public class UnaryOperations {
    public static void main(String[] args) {


        // Unary Plus (+) it does not have any effect on number

        int number = 10;
        number = +number;

        int number1 = -10;
        number1 = + number1;
        System.out.println(number);

        // Unary Minus (-)

        int number2 = -20;
        number2 = -number2;
        System.out.println(number2);

        int number3 = 30;
        number3 = - number3;
        System.out.println(number3);

        // Increasment operator ++

        int number4 =8;
        number4++;
       ++ number4;
        System.out.println(number4);

        // Decrement Operator(--)
        int number5 = 30;
        number5 --;
        System.out.println(number5);

        --number5;
        System.out.println(number5);

        // invert (!)
        boolean bool = true;
        bool = !bool;
        System.out.println(bool);




    }
}
