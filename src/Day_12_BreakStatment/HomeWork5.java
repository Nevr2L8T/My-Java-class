package Day_12_BreakStatment;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        //-Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
        //- based on the point the code should automatically determine the grade of Student with the full name of the student
        //- This should be done for each student
        //- Assuming we do not know how many student are there but your code should still handle this situation
        //-  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
        //- When the point is between 90 to 100 the grade should be A
        //- When the point is between 80 to 90(excluded) the grade should be B
        //- When the point is between 70 to 80(excluded) the grade should be C
        //- When the point is between 60 to 70 (excluded) the grade should be D
        //- When the point is less than 60 the grade should be F
        //- Example output (First Name = Ziya Last Name = Yilmaz Grade: A )

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first students name please.");
        String firstNAme = sc.next();

        System.out.println("Enter the students last name please. ");
        String lastName = sc.next();

        System.out.println("Enter the student grade please. ");
        double grade = sc.nextDouble();

        String result ="";

        while (true){
            if (grade >=90 && grade<=100){
                result="A";

            }
            else if (grade >=80 && grade <90){
                result ="B";

            }
            else if (grade >=70 && grade <80){
                result="C";

            }
            else if (grade >=60 && grade <70){
                result="D";

            }
            else if (grade <60 && grade >=0){
                result="F";

            }else {
                System.out.println("out of range");
            }
            System.out.print("first name: "+" "+firstNAme+"\nlast name: "+lastName+"\nscore: "+result);
            //System.out.println("first name");
            firstNAme=sc.next();

            System.out.println("enter last");
            lastName=sc.next();

            System.out.println("enter grade");
            grade=sc.nextDouble();
            break;
        }
          System.out.println("exit");





    }
}
