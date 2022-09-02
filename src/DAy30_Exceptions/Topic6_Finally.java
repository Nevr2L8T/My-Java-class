package DAy30_Exceptions;

import java.util.NoSuchElementException;

public class Topic6_Finally {
    public static void main(String[] args) {
        int [] numbers = {90,45,67};
        try {
            int a = numbers[8];
            System.out.println(a);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }
        catch (ArithmeticException ex){
            ex.printStackTrace();

        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("this is the final code");
        }
    }
}
