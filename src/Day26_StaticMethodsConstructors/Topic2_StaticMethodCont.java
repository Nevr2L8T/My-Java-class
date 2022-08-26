package Day26_StaticMethodsConstructors;
import java.util.*;
import MyUtil.StaticTestClass;

public class Topic2_StaticMethodCont {
    public void TestNonStatic(){
        StaticTestClass.PrintStatic();
    }
    public void Test(){
       //TestNonStatic();
        System.out.println("this is from non static");
    }
    public static void StaticMethod(){
        System.out.println("hello from static method");
    }
    public static void main(String[] args) {
        StaticTestClass.PrintStatic();
        StaticTestClass ins = new StaticTestClass();
        ins.Print();
        //TestNonStatic();

        StaticMethod();

        Topic2_StaticMethodCont Ojb1 = new Topic2_StaticMethodCont();
        Ojb1.TestNonStatic();
        Ojb1.StaticMethod();

    }
}
