package Day_5_IfStatments;

public class Topic_8IfElseIfElseExample {
    public static void main(String[] args) {

        //
        int point = 75;

        if (point>=90){
            System.out.println("the grade is A");
        }
        else if (point>=80 && point<90){
            System.out.println("the grade is B");
        }
        else if (point>=70 && point<80){

            System.out.println("the grade is c");
        }
        else if (point>=60 && point<70){
            System.out.println("the grade is d");
        }
        else {
            System.out.println("the grade is f");
        }
    }
}
