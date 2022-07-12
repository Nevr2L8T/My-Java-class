package Day_6_IfElseCont;

public class Topic3_TeranaryExample {
    public static void main(String[] args) {


        // check if the number is even or odd

        int num = 89;
        String result;
       /* if (num % 2 == 0){
            result = "even";

        }else  result = "odd";
        System.out.println("the number is:"+result);*/


        result = (num % 2==0) ? "even" : "odd";
        System.out.println("the number is result:" + result);


    }
}
