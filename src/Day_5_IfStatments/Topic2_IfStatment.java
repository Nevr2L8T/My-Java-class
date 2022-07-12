package Day_5_IfStatments;

public class Topic2_IfStatment {
    public static void main(String[] args) {


        // If is a condition where it decides if the code block should run or not

        /***
         * if (condition
         *
         *
         */

        String name = "Class, this is the code block";

        int var1 = 10;

        if(var1==10){
            System.out.println(name);

        }

        if (10>11){
            System.out.println("this is non sense");

        }
        String name1 = "Ziya";

        if(name1 == "Recep"){
            System.out.println(name1);
        }
        int a = 10;

        if (a++ == 11){
            System.out.println("this is the second line");
        }

    }
}
