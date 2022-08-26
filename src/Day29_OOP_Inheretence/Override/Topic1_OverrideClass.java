package Day29_OOP_Inheretence.Override;

public class Topic1_OverrideClass {
    public String Firstname;
    public String Lstname;

    public int age;

    public void Display(){
        System.out.println("The firstname: "+Firstname+" Lastname is: "+Lstname+"Age: "+age);
    }
    public void Eat(){
        System.out.println("People eat: ");
    }
    protected void Sub(){
        System.out.println("This is protected method");
    }

}

