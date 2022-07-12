package Day_6_IfElseCont;

public class Topic5_TernaryExample2 {
    public static void main(String[] args) {


        // points greater than 100 0r <0- out of range
        // 90-100 gradeA
        //80-90 grade B
        //70-80 grade c
        //60-70 grade D
        //50-60 grade F
        //less than 50 grade failed

        int points = 0;
        String grade;
        grade = (points<0 || points>100) ? "out of range": (points>=90 && points<=100)? "grade A":
                (points<=90 && points>80)? "grade B": (points<80 && points>=70)? "grade C":
                        (points<70 && points>=60)? "grade D": (points<60 && points>=50)? "grade F":"grade failed";

        System.out.println("student grade is:"+grade);
    }
}
