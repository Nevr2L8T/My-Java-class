package Day26_StaticMethodsConstructors;

import MyUtil.StaticTestClass;

public class Topic1_StaticMethods {
    public static void main(String[] args) {

        System.out.println("Print Static int variable:"+StaticTestClass.Name);
        System.out.println("print the static num:"+StaticTestClass.num);
      //  System.out.println("non-static"+StaticTestClass.Name2); error
        System.out.println("***************************************************");

        StaticTestClass obj = new StaticTestClass();
        System.out.println(" print non static " +obj.Name2);
        System.out.println("print non-static num2 "+obj.num2);

        System.out.println("print static Name "+obj.Name);
        System.out.println("Static num2 "+obj.num);

    }

}
