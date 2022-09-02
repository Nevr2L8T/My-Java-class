package Day31_Abstraction.AbstractClasses;

public class Test {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.setName("Max");
        dg.setAge(2.5);
        dg.setBreed("Doberman");
        System.out.println("The age of the dog: "+dg.age);
        System.out.println("The name of the dog: "+dg.Name);
        System.out.println("The breed of the dog is: "+dg.breed);
        dg.Saysomething();
    }
}
