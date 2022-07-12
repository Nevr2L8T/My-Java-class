package Day_4_Operators;

public class LogicalOperations {
    public static void main(String[] args) {


        // And operation "&&'

        boolean balls = (12>7)&&(3<8)&&(9==7);

        System.out.println(balls);
        boolean flowers = (true)&&(3<=8)&&(8!=9)&&(false);
        System.out.println(flowers);

        //Or operation "||"

        boolean flo = (9>11)||(6<9);
        System.out.println(flo);

        boolean shoes = ("ziya"=="Ziya")||('C'=='c');
        System.out.println(shoes);

        // not !

        boolean cars = !("red" == "blue");
        System.out.println(cars);


        boolean Q = !(((4==5)||(7<9))&&((8<=10)||(true)));
        System.out.println(Q);




    }
}
