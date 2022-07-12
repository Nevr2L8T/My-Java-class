package DAy_10StringMthods;

public class Day_10StringMethods {
    public static void main(String[] args) {

        String str1 = "LokmanEkin";
        String substr1 = str1.substring(6);
        System.out.println(substr1);

        String substr2= str1.substring(0);
        System.out.println(substr2);
        String substr3 = str1.substring(3,6);
        System.out.println(substr3);
        String subst4 = str1.substring(3,str1.length());
        System.out.println(subst4);

        //toLowerCase()
        String str2 = "YaSeEN";
        String lowstr1 = str2.toLowerCase();
        System.out.println(lowstr1);

        //toUpperCase(),

        String upstr1 = str2.toUpperCase();
        System.out.println(upstr1);

        //trim()
        String str3 = " Cev det ";
        String trstr3 = str3.trim();
        System.out.println(trstr3);





    }
}
