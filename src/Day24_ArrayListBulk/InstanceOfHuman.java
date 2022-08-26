package Day24_ArrayListBulk;


import java.util.Scanner;

public class InstanceOfHuman {
    //Scanner sc = new Scanner();
    public static void main(String[] args) {
    Human FirstHuman = new Human();
    FirstHuman.setEssentials(36,"adam","eve");
    FirstHuman.SetNonessentals("qa enginer","bi",6.9,190.90);
    FirstHuman.printJobAndWeight();
    int adamAge =FirstHuman.GetAge();
        System.out.println(adamAge);
        System.out.println(FirstHuman.GetNAme());
        System.out.println(FirstHuman.age);



    }
}
