package Day22_WrapperClasses;

public class Topic4_ParseMethod {
    public static void main(String[] args) {
        String instaString = "6785";
        instaString = instaString +25;

        System.out.println("the value is : "+instaString);

        int a = Integer.parseInt(instaString);
        int c = a+25;
        System.out.println("the value as integer: "+c);

        String doublrString = "789.6564";
        double db1 = Double.parseDouble(doublrString);
        System.out.println("the double value as numbers: "+db1);
        System.out.println(db1+35);

        String std1 = "6789.543";
        Double nubber = Double.parseDouble(std1);
         double d1 = nubber +56;
        System.out.println("this is a test for d1"+d1);

        String st10 = "7890.76";
        Double db6 = Double.valueOf(st10);
         double name = db6;

       //  String Stnum = "6568hf";

         //int var1 = Integer.parseInt(Stnum);


    }

}
