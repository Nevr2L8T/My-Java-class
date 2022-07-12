package Practice;

public class StringMethods2 {
    public static void main(String[] args) {
        //indexOf
        //fromIndexOf

        String mystr = "Hello language Java, you are a great language.";
        System.out.println(mystr.indexOf("e"));
        int indexOfl = mystr.indexOf("l");
        System.out.println(indexOfl);
        System.out.println(mystr.indexOf("language"));
        System.out.println(mystr.indexOf("e", 5));
        System.out.println("**********************************");

        //lastIndexOf
        System.out.println(mystr.lastIndexOf("e"));
        System.out.println(mystr.lastIndexOf("language"));
        System.out.println("**********************************");

        String myString1 = "Hello";
        String myString2 = "";
        System.out.println(myString1.isEmpty());
        System.out.println(myString2.isEmpty());
        System.out.println("************************************");

        //length

        String txt = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(txt.length());
        System.out.println(txt.indexOf("z"));
        System.out.println("***********************************");

        //replace
        //replaceFirst

        String text = "Hello Hello";
        String text2 = "Hello Hello";
        System.out.println(text.replace("l","p"));
        System.out.println(text2.replaceFirst("l","p"));








    }
}
