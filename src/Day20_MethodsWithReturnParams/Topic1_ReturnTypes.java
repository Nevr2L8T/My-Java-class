package Day20_MethodsWithReturnParams;

public class Topic1_ReturnTypes {
    public static void Count(int []name){
        System.out.println("the count of items in the array is"+name.length);
        Sum(name);
    }
    public static void Sum(int [] name1){
        int sum = 0;
        for (int a:name1){
            sum=sum +a;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int [] arr = {3,4,56,7,8,9,0,5};
            Count(arr);
            Sum(arr);
        }

    }

