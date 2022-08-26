package Day22_WrapperClasses;

public class Topic1_MethodOverloading {
    public static String RemoveChar(String str,char c){
        String newStr = "";
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==c){
                continue;
            }
            else {
                newStr = newStr + str.charAt(i);
            }

        }
        return newStr;

    }
    public static void main(String[] args) {
        String name = "Ziya,Yaseen,Gulay";
       String[] names =name.split(",");
        System.out.println("the first element"+names[0]);

        String st = RemoveChar("ASGSSTTTTHDF",'T');
       st= st.toLowerCase();
        System.out.println("This is a new String: "+st);
        String whatever = "jdsfUFESSSAWKHFDSFH";

        String newVal =RemoveChar(whatever,'S',4,12);
        newVal=newVal.toLowerCase();
        System.out.println("the new string is"+newVal);

    }
    public static String RemoveChar(String str1, char ch, int start, int end){
        String str2 = "";
        for (int i = 0; i <str1.length() ; i++) {
            if (i<start || i>=end){
                str2=str2 +str1.charAt(i);
            }
            else {
                if(str1.charAt(i)==ch){
                    continue;
                }
                else str2 = str2 +str1.charAt(i);
            }
        }return  str2;

        }
}
