package Day_6_IfElseCont;

public class Topic4_MultipleTernary {
    public static void main(String[] args) {

        //number is 0 just say zero
        // if it is even say even
        //or if it is odd say odd


        int num = 0;
        String Result;

        if (num ==0){
            Result ="zero";
        }else if (num % 2 ==0){
            Result = "even";
        }else Result = "odd";
            Result = (num == 0) ? "zero" : (num % 2 == 0) ? "even": "odd";
        System.out.println("the result is :"+Result);




}}
