package Day19_Methods;

public class Topic5_MethodsExamples {
    public static void MyFirstMethod() {
        System.out.println("This is my fist method");



    }
    public static void SumTheNumbers(int a,int b){
        int sum = a+b;
        System.out.println("The sum of those two numbers is "+sum);

    }

    public static void main(String[] args) {
        MyFirstMethod();
        MyFirstMethod();
        MyFirstMethod();
        System.out.println("this is inside the main method");
        MyFirstMethod();
        SumTheNumbers(7,10);


    }
}
