package HomeWork;

public class Day19_HomeWork3 {
        /*write a method where it takes 2 double values and 1 integer value.
          When the integer value is 1 it returns to sum of the 2 double numbers,
          when integer is 2 it returns the subtraction of those 2 double number,
           when integer value is 3 it returns to the multiplication of those 2 double numbers,
            and when the integer value is 4 it returns the division of those 2 double numbers*/
    public static void main(String[] args) {

        System.out.println(bird(4.1,3.1,3));


    }
    public static double bird(double A,double B, int C){
        double total = 0;

        if (C == 1){
            total = A+B;
        }
        else if(C == 2){
            total = A-B;
        }
        else if(C == 3){
            total = A*B;
        }else if(C ==4){
            total = A/B;
        }
        return total;

    }

}

