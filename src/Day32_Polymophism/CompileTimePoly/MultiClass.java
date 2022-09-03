package Day32_Polymophism.CompileTimePoly;

public class MultiClass {
    public static double Multiplication(double a,double b){
        return (a*b);
    }
    public double Multiplication(double q, double u, double v){
        return (q*u*v);
    }
    public void Multiplication(double q,double u, double v,String name){
        System.out.println("this is the result: ");
    }
}
