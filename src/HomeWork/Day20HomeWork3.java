package HomeWork;

/*Write a method where it takes a String and returns to a String by adding "Not" in front of the String only if It does not have "Not" in front of it already.

ex. a = "CAR'
 notString("Car" )  == > "Not Car"
 notString("Home"). ==> "Not Home"
 notString("Not Home") == > "Home"*/
public class Day20HomeWork3 {
    public static void main(String[] args) {
        blue(" Car");
        blue(" Not Car");
        blue(" Not Home");
        blue(" Home");
    }
    public static void blue(String A){
        if (A.contains("Not")){
            System.out.println(A.replace("Not"," "));
        }
        else{
            System.out.println("Not"+A);
        }
        return;

    }
}
