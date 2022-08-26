package Day19_Methods;

import java.util.Scanner;

public class Topic6_MethodExample2 {

    // write a method that has three input parameters and finds the max number between those 3 numbers
    public static void MyFunc(int a,int b,int c){
        int max = 0;
        if (a>b && a>c){
            max = a;

        }
        else if( b>a && b>c){
            max=b;

        }else {
            max = c;
        }
        System.out.println("the max number is"+max);

    }
    public static void CallMyFunction(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a name");
        String name = scan.next();
        System.out.println("the name you entered is "+name);


    }public static void PrintNames(String name){
        System.out.println("name is "+name);

    }
    public static void PrintName1(int times){
        for (int i=0;i<times;i++){
            System.out.println("the  name is ziya ");
        }
    }

    public static void main(String[] args) {

        CallMyFunction();
        MyFunc(8,98,9);

        for (int i=0;i<10;i++){

        PrintNames("Sarp");
        }
        PrintName1(4);

    }

}
