package Day31_Abstraction.AbstractClasses;

public class Dog extends Animal {
    String Name;
    double age;
    String breed;

    @Override
    void setBreed(String breed) {
        this.breed = breed;

    }

    public void setName(String nam) {

        this.Name = nam;
    }

    public void setAge(double age){
        this.age = age;
    }
    public void Saysomething(){
        super.Saysomething();
        System.out.println("This is from the dog class");
    }
}
