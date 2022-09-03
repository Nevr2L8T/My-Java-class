package Day32_Polymophism.CompileTimePoly;

public class TestMulti {
    public static void main(String[] args) {
        MultiClass ml = new MultiClass();
        double result = ml.Multiplication(78,9);
        System.out.println("the result is: "+result);
        double result2 = ml.Multiplication(90,87,80);
        System.out.println("the result is: "+result2);
         ml.Multiplication(90,87,80,"ziya");



    }
}
