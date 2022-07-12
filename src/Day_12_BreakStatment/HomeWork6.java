package Day_12_BreakStatment;

public class HomeWork6 {
    public static void main(String[] args) {

        //Write a code where it ask user to enter an integer number
        //- Reverse the given number and print the result
        //- Example input ( 5678 )
        //- Example output ( 8765 )

        int num = 6543;
        int reverse = 0;

        while (num !=0){
            int i = num % 10;
            reverse=reverse*10+i;
            num=num/10;

        }
        System.out.println(reverse);
    }
}
