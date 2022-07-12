package Day_12_BreakStatment;

public class Topic4_ContinueExample {
    public static void main(String[] args) {
        // write a code where it checks every character in a string and when it sees "L" or "A" pass
        // print the end result
        String ex = "HELLOAPPLE";
        String result = "";

         for (int i=0; i<ex.length(); i++){
             result=result+ex.charAt(i);
             if (ex.charAt(i)=='L'|| ex.charAt(i)=='A'){
                 continue;
             }
             System.out.println(ex.charAt(i));
         }
        System.out.println(result);


    }
}
