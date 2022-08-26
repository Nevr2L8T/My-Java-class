package Day21_MethodsAndMethodsOverload;

public class opic2_MethodOverLosding {
    public static void Name(String fname){
        System.out.println("The first name is "+fname);
    }
    public static void Name(String FName,String LName){
        System.out.println("The first name"+FName+"The last name"+LName);
    }
    public static String Name(String FName, String LName, int age){
        System.out.println("the first name is "+FName);
        return "The first name is: "+FName+"The last name is: "+LName+" The age is: "+age;
    }

    public static void main(String[] args) {
        Name(" Ziya ");
        Name(" ziya "," yilmaz ");
       System.out.println(Name(" Rachel "," Reeves ", 47));
    }
}
