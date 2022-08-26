package Day26_StaticMethodsConstructors;

public class Topic5_ConstructorChaining {

    int a;
    double b;
    String name;
    public Topic5_ConstructorChaining(int num1,double dnum,String name){
       this.a =num1;
        this.b= dnum;
        this.name = name;
    }

    public static void main(String[] args) {
        Topic5_ConstructorChaining ins1 = new Topic5_ConstructorChaining(30,100.23,"Gulay");
       /* ins1.a = 10;
        ins1.b = 90.456;
        ins1.Name = "Gulay";*/

        System.out.println("the a value "+ins1.a);
        System.out.println("the b value"+ins1.b);
        System.out.println("the name value "+ins1.name);
    }

}
