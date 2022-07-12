package Day_9_Strings;

public class Topic_2_StringMethods {
    public static void main(String[] args) {

        //char At()
        String str ="Renas";
        char firstL = str.charAt(4);
        System.out.println(firstL);
        System.out.println(str.charAt(3));

        // concat()

        String str1= "name0";
        String str2= "name1";
        String str6 = "ziya";
        String str3 = str1.concat(str2);
        String str5 = str1.concat(str6).concat(str2);
        System.out.println(str5);
        String str4= str1+str2;

        System.out.println(str4);
        //contains()
        String name1 = "Gulay";
        boolean YN = name1.contains("lu");
        System.out.println(YN);

        //endwith ()
        boolean YN1 = name1.endsWith("ay");
        System.out.println(YN1);

        String name2 = "Sam";
        String  name3 = "sam";
         boolean YN3 = name2.equals(name3);
        System.out.println(YN3);
        System.out.println(name2.equalsIgnoreCase(name3));

        //indexOf()
        String name5 = "banana";
        int ind = name5.indexOf('a');
        System.out.println(ind);

        //isEmpty()
        String emp = "";
        System.out.println(emp.isEmpty());
        //lastindexOf()

       int lst = name5.lastIndexOf('a');
        System.out.println(lst);

        //length
        String str100 = "jhkjhkjhkhh";
        int count = str100.length();
        System.out.println(count);

        //replace()
        String name12 = "Gulay";
       String  name13=name12.replace('G','n');
        System.out.println(name13);

        //startsWith()
        String name16 = "Alican";
        boolean YN5 = name16.startsWith("Al");
        System.out.println(YN5);

        //













    }
}
