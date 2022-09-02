package Day31_Abstraction.AbstractClasses;

abstract class Animal {
    public static String name = "Name of animal";
    public Animal(){
        System.out.println("This is the constructor");
    }
    abstract void setBreed(String breed);

    public void Saysomething(){
        System.out.println("This is from the Abstract class and non abtract method");
    }
}
