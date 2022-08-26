package Day25_ClassesAndObjects;

public class Topic1_StaticVariables {
    static int age = 10;
    int b = 14;

    public static void main(String[] args) {
        Topic1_StaticVariables newTopic = new Topic1_StaticVariables();
        System.out.println(newTopic.b);
        System.out.println(age);

        Topic2_newClass ob1 = new Topic2_newClass();
        System.out.println(Topic2_newClass.Firstname);
        System.out.println(ob1.LastName);
    }
}
