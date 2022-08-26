package Day19_Methods;

public class Practice {

    public static void main(String[] args) {
        System.out.println("practice: "+trufls("rachel","Rachel"));
        System.out.println("practice: "+trufls("Rachel","Rachel"));
    }
    public static boolean trufls(String str1,String str2){
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
    }

}
