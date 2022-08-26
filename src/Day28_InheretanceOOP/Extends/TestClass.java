package Day28_InheretanceOOP.Extends;

public class TestClass {
    public static void main(String[] args) {
        Animal an1n= new Animal();
        an1n.Name ="JuJu";
        an1n.Color ="Black";
        an1n.legCount = 4;
        an1n.Age = 2.5;
        an1n.Gender = "female";

        an1n.Display();
        System.out.println(an1n);
        an1n.Eat();
        an1n.Grow();
        System.out.println("***********************************************");

        Dog dog1 = new Dog();
        dog1.Name ="Ace";
        dog1.Age = 1.5;
        dog1.Color = "white";
        dog1.legCount = 3;
        dog1.Gender = "Male";
        dog1.ToothCount = 14;
        dog1.Eat();
        dog1.Grow();
        dog1.Display();
        dog1.Shed();
        dog1.walk();
        System.out.println("************************************************");
        Fish fs = new Fish();
        fs.Name ="Ace";
        fs.Age = 1.5;
        fs.Color = "white";
        fs.legCount = 3;
        fs.Gender = "Male";
        fs.Swim();
        fs.Eat();
        fs.Grow();
        fs.Display();






    }
}
