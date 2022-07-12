package Day_3ArtimaticOperations;

public class RelationalOperations {
    public static void main(String[]args){
        int number = 10;
        // first logical expression
        //== options are either true or false

        boolean b1 =10==10;
        System.out.println(b1);

        boolean b2 = "<"==">";
        System.out.println(b2);


        //second >= checks to things and if it is greater or equal it will return true
        boolean b3 = 12>= 10;
        System.out.println(b3);
        boolean b4= 12>=200;
        System.out.println(b4);
        System.out.println(10>=12);

        //third <= less or equal it returns true otherwise false

        boolean b5 = 14<= 15;
        System.out.println(b5);
        boolean b6 = 17<= 16;
        System.out.println(b6);

        //fourth != not equal compares 2 things not equal return true otherwise false

        boolean b7 =14 != 14;
        System.out.println(b7);
        boolean b8 =27 != 23;
        System.out.println(b8);
        
        // fifth > compares 2 things if 1 is greater than the other it is true 
        
        boolean b9 = 14>15;
        boolean b10 = 30> 20;

        // sixth < if it's less it comes back true

        boolean b11 = 11<9000;
        boolean b12 = 900< 100;
        System.out.println(b11);
        System.out.println(b12);

        boolean b13 = !( true == false);
        System.out.println(b13);

        //( !) it will convert false to true and true to false

        boolean b14v= !((true == false) == !(10<=11));
        System.out.println(b14v);

        boolean b15 =!(('C'=='c')==(13==14)==!(("er"=="ER")==(true==true)));
        System.out.println(b15);





        
    }
}
