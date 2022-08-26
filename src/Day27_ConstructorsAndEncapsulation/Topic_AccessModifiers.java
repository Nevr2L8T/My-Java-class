package Day27_ConstructorsAndEncapsulation;

import MyUtil.AccessModifTest;

public class Topic_AccessModifiers {
    public char ch ='z';
    private char ch1 = 'h';
    protected char ch2 = 's';
    char ch3 = 'e';

    public static void main(String[] args) {
        Topic_AccessModifiers tp = new Topic_AccessModifiers();
        System.out.println(tp.ch);
        System.out.println(tp.ch1);
        System.out.println(tp.ch2);
        System.out.println(tp.ch3);

        AccessModif ac = new AccessModif();
        System.out.println(ac.num);
       // System.out.println(ac.num1);
        System.out.println(ac.num2);
        System.out.println(ac.num3);

        AccessModifTest tst = new AccessModifTest();
        System.out.println("name"+tst.name);




    }

}
