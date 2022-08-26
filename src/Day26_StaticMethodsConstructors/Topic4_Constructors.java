package Day26_StaticMethodsConstructors;

public class Topic4_Constructors {
    public Topic4_Constructors(){
        System.out.println("this is from the constructor");
    }
    public Topic4_Constructors(int a){
        System.out.println("This is from the second constructor with the value a "+a);
    }
    public Topic4_Constructors(String Name,double money){
        System.out.println(Name+" has a lot of money"+money);

    }

    public static void main(String[] args) {
        Topic4_Constructors obj = new Topic4_Constructors();
        Topic4_Constructors obj1 = new Topic4_Constructors(90);
        Topic4_Constructors obj2 = new Topic4_Constructors("Sam",90.87);


    }

}
