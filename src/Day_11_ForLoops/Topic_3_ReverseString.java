package Day_11_ForLoops;

public class Topic_3_ReverseString {
    public static void main(String[] args) {
        //Strings are indexed
        //the first char of a string has an index of 0
        // the last char in a string has an index of length -1

        String Canram = "hello";
       // Canram.charAt(0);
        System.out.println(Canram.charAt(0));
        System.out.println(Canram.charAt(Canram.length()-1));
        System.out.println(Canram.charAt(Canram.length()-2));
        System.out.println(Canram.charAt(Canram.length()-2));

        System.out.println(Canram.charAt(Canram.length()-4));
        System.out.println(Canram.charAt(Canram.length()-5));

         String reverse = "";
        for (int banu = Canram.length()-1;banu>=0; banu--){
            reverse = reverse + Canram.charAt(banu);


        }
        System.out.println(reverse);






    }
}
