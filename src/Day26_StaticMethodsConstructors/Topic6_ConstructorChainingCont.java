package Day26_StaticMethodsConstructors;

public class Topic6_ConstructorChainingCont {

    public Topic6_ConstructorChainingCont(int num1){
        System.out.println("this is from the constuctor that take s a int value "+num1);


    }
    public Topic6_ConstructorChainingCont(String name1){
        System.out.println("this is from the constuctor that take s a string"+name1);


    }

    public static void main(String[] args) {
        Topic6_ConstructorChainingCont ins = new Topic6_ConstructorChainingCont(56);
        Topic6_ConstructorChainingCont ins1 = new Topic6_ConstructorChainingCont("Sevgi");
    }
}
