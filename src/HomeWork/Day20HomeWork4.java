package HomeWork;
/*
Write a method where it takes 2 String parameters as input and Concatenate them and returns to a string,
 but also could handle a situation where It takes 2 String and 1 integer value where it only prints the 2 strings by integer value times.
ex -  ConcatandPrint("FirstName","LastName") it will return ==> FirstNameLastName
  	  ConcatandPrint("FirstName","LastName", 3) it will print ==> "FirstName" and "Lastname" 3 times. */
public class Day20HomeWork4 {
    public static void main(String[] args) {
        ConcatAndPrint("Rachel","Reeves");
        ConcatAndPrint("Rchel","Reeves",3);
    }

    public static String ConcatAndPrint(String FName,String LName){
        String  str = FName.concat(LName);
        return str;
    }
    public static void ConcatAndPrint(String FName,String LName,int repeat){
        for (int i = 0; i <=repeat ; i++) {
            System.out.println(FName+LName);



        }


    }
}
