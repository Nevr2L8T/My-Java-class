package Day29_OOP_Inheretence.Override;

public class Topic2_OverrideTest extends Topic1_OverrideClass {
    @Override
    public void Eat() {
        super.Eat();
        System.out.println("Bakir eat ");

    }

    @Override
    public void Sub() {
        super.Sub();
        System.out.println("This is protected from sub class");
    }
}
