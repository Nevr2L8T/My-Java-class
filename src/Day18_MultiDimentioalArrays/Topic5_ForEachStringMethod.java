package Day18_MultiDimentioalArrays;

public class Topic5_ForEachStringMethod {
    public static void main(String[] args) {
        //Strings are not a collection it is an object

        String stnames = "seray";
        char[] lt = stnames.toCharArray();
                for(char ch:lt){
                    System.out.println(ch);
                }
        System.out.println("*******************************************");
                String cool = "java is coll but it is hard";
                String [] wrd = cool.split(" ");
                for (String words: wrd){
                    System.out.println(words);
                }


    }
}
