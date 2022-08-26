package Day20_MethodsWithReturnParams;

public class Topic2_ReturnType1 {

    public static String name(int a, int b){
        if(a>b){
            return "ziya";
        }else if (b>a){
            return "jason";
        }else {
            return "hiseyin";
        }

    }

    public static void main(String[] args) {
        String name = name(3,4);
        System.out.println("the name is Jason "+name);

    }

}
