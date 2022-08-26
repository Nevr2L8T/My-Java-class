package HomeWork;

    /*Write code with followings
Write Employee Class where it has Int "Employee Id", String "Employee Name" and double "Employee Salary"
Write a code where It ask user to enter Employee ID, Employee Name and Employee Salary where anytime user creates a new object of Employee Class.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Day26_HomeWork36_Employee {

    int EmployeeId;
    String EmployeeName;
    double EmployeeSalary;

    public Day26_HomeWork36_Employee(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter employee Id number: ");
        this.EmployeeId = sc.nextInt();

        System.out.println("Enter employee name: ");
        this.EmployeeName = sc.next();

        System.out.println("Enter employee salary: ");
        this.EmployeeSalary = sc.nextDouble();
    }

    public static void main(String[] args) {
        ArrayList<Day26_HomeWork36_Employee> infoLst = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
        Day26_HomeWork36_Employee str = new Day26_HomeWork36_Employee();
        infoLst.add(str);


        }

    }
}

