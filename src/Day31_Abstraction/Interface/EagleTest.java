package Day31_Abstraction.Interface;

public class EagleTest {
    public static void main(String[] args) {
        Eagle eg = new Eagle();
        eg.Name = "renastech";
        eg.type = "Bald";
        int age = eg.setAge(3);
        eg.setBreed("American");
        eg.setLegCount(2);
        eg.WingCount(2);
        eg.Fly();
        eg.Live();
        System.out.println("Eagle name: "+eg.Name);
        System.out.println("Eagle type: "+eg.type+"eagle age: "+eg.age);

    }
}
