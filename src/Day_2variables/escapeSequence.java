package Day_2variables;

public class escapeSequence {
    public static void main(String[]args){
        // \t is going to leave paragraph space on the console
        System.out.print("\t this is a tab space \t this is another one");
        System.out.print("this is a test\t");

        // \n it is going to the new line on the console
        System.out.print("\n New line");
        System.out.print("\n This is \"Rachel\"");

        System.out.println("\n This is back slash\\");
        // \'prints single quote
        System.out.println("\n this is \'Rachel\'");
        System.out.println("This  \\");
        System.out.println("");

    }

    public static class Variables {

        public static void main(String[]args){
            // boolean, it is true or false. it is one bit,
            boolean bolvalue = true;
            System.out.println(bolvalue);
            bolvalue = false;
            System.out.println(bolvalue);

            //byte , it is 8 bit,values between -128 to 127
             byte bytevalue = 120;
             System.out.println(bytevalue);

            // char comes from character, it is 16 bytes, it contains characters, numbers and so on
            char charvalue = 'w';
            System.out.println(charvalue);

            // short it takes values  - 32768 to 32767
            short shortvalue = 3000;
            System.out.println(shortvalue);

            // int it is short for integers 32 bits
            int intvalue = 40000;
            System.out.println(intvalue);

            // long 64 bits memory capacity
            long longvalue = 454746767;
            System.out.println(longvalue);

            // float it is 32 bits it holds only 7 decimal digits
            float floatvalue =123.7f;
            System.out.println(floatvalue);
            float floatvalue2 = 123.544f;
            System.out.println(floatvalue2);

            // double 64 bits can hold up to 16 digits after decimal point
            double doublevalue = 123.6464647;
            System.out.println(doublevalue);

            // non- primitive,

        }

    }
}
