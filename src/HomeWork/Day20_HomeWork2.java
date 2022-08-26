package HomeWork;
/*We have two monkeys,   a   and b,   and the parameters aSmile and bSmile indicate if each is smiling.
        We are in trouble if they are both smiling or if neither of them is smiling.   Return true if we are in
        trouble.
        monkeyTrouble(true,   true)   →   true
        monkeyTrouble(false,   false)   →   true
        monkeyTrouble(true,   false)   →   false*/
public class Day20_HomeWork2 {
    public static void main(String[] args) {

        System.out.println("Are we in trouble with the Monkeys? "+Monkeys(true,false));
    }
    public static boolean Monkeys(boolean asmile,boolean bsmile){
        boolean trouble;

        if(asmile ==true && bsmile ==true){
            trouble =true;
        }
        else if(asmile ==false && bsmile ==false){
            trouble = true;
        }
        else{
            trouble=false;
        }
            return trouble;
    }

}
