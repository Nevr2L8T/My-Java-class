package MyUtil;

public class StaticTestClass {

    public static int num = 30;
    public static String Name = "Cenky";

    public  int num2 = 25;
    public String Name2 = "Bulent";



    public static void PrintStatic(){
        System.out.println("This is from Static amethod");
    }

    public void Print(){
        System.out.println("this is from non-static method");

    }
}
