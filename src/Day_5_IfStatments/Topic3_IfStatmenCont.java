package Day_5_IfStatments;

public class Topic3_IfStatmenCont {
    public static void main(String[] args) {
        // lets define 3 different numbers
        //write a code where it compares 3 differant numbers
        //and prints the maximum number

        int number1 = 199;

        int number2 = 27;

        int number3 = 189;

        boolean bool1 = number1>number2 && number1> number3;
         boolean bool2 = number2>number1&& number2>number3;
         boolean bool3 = number3>number1 && number3>number2;

         if (bool1){
             System.out.println("the max number is:"+number1);
         }
         if(bool2){
             System.out.println("the max number is:"+number2);
         }
         if(bool3){
             System.out.println("the max number is:"+number3);
         }

    }
}
