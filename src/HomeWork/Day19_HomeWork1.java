package HomeWork;

public class Day19_HomeWork1 {
        /*Write a method where it takes 2 strings as a parameter and returns true when 2 strings are equal and return false when they are not equal.*/
    public static void main(String[] args) {
        System.out.println("The output is: "+truFls("happy","Happy"));
        System.out.println("The output is: "+truFls("Happy","Happy"));
    }
    public static boolean truFls(String str1,String str2){
        if (str1.equals(str2)){
            return true;
        }
        else {
            return false;
        }
    }
}
