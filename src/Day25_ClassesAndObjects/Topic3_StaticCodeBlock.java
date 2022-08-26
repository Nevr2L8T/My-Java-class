package Day25_ClassesAndObjects;

public class Topic3_StaticCodeBlock {
    {
        System.out.println("hello from code block");
    }
    static {
        System.out.println("static code");
    }

    public static void main(String[] args) {
        System.out.println("this is ziya");
        Topic3_StaticCodeBlock newSt = new Topic3_StaticCodeBlock();
    }
}
