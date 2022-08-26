package Day27_ConstructorsAndEncapsulation;

import java.util.Scanner;

public class StudentInfo {
    String name;
    double Score;
    String grade;

    public StudentInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter students name");
        this.name = sc.next();
        System.out.println("enter students score");
        this.Score = sc.nextDouble();
        System.out.println("enter students grade");
        this.grade = sc.next();

    }
}
