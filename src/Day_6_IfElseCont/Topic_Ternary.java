package Day_6_IfElseCont;

public class Topic_Ternary {
    public static void main(String[] args) {


        // write a code where it checks 2 numbers and assigns the bigger to variable max

        int number1= 89;
        int number2 = 50;
        int max;

        if (number1>number2){
            max = number1;
        }else  max = number2;
        System.out.println("the max is:"+max);

        // ternary max =
        max = (number1>number2) ? number1 : number2;
        System.out.println("this is the second line"+max);
        //Ternary max = ( nuber1>nuber2) ? number1 : nuber2

        max = (number1>number2) ? number1 : number2;
        System.out.println(max);
    }

}
