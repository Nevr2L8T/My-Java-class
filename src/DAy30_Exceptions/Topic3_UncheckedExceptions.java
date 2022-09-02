package DAy30_Exceptions;

public class Topic3_UncheckedExceptions {
    public static void main(String[] args) {
        int a = 90;
        int  b = 0;
        try {

        int result = a/b;
        System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
