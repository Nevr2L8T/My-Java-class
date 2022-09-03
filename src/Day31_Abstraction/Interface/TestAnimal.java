package Day31_Abstraction.Interface;

public class TestAnimal {
    public static void main(String[] args) {
       // Animal an = new Animal() {
        Dog dg = new Dog();
        System.out.println(dg.setAge(2));
        dg.setBreed("Doberman");
        dg.setName("Lilly");
        dg.setLegCount(4);
        System.out.println("Dog Name: "+dg.Name);
        System.out.println("Dog age: "+dg.age);
        System.out.println("Dog breed: "+dg.breed);
        System.out.println("Dog leg count: "+dg.legCount);
        }
    }

