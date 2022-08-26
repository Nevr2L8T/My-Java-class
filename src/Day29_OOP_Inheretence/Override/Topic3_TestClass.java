package Day29_OOP_Inheretence.Override;

public class Topic3_TestClass {
    public static void main(String[] args) {
        Topic2_OverrideTest Bakir = new Topic2_OverrideTest();
        Bakir.Firstname = " Bakir ";
        Bakir.Lstname = " Murad ";
        Bakir.age = 23;

        Bakir.Display();
        Bakir.Eat();
        Bakir.Sub();
        Topic1_OverrideClass people = new Topic1_OverrideClass();
        System.out.println("********************************************");

        people.Firstname = "People";
        people.Lstname = "Human";
        people.age = 109;

        people.Eat();
        people.Sub();
        people.Display();
        System.out.println("************************************");

    Topic2_OverrideTest rachel = new Topic2_OverrideTest();
    rachel.Firstname = "Rachel";
    rachel.Lstname = "Reeves";
    rachel.age = 47;

    rachel.Eat();
    rachel.Sub();
        rachel.Display();
    }

}
