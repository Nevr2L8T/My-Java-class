package Day_12_BreakStatment;

public class Topic2_BreakExample {
    public static void main(String[] args) {
        //for (start, end, iteration
        //what is in hear will run until the end point
        //break is used to break the code
        String hello = "Hello";
        String result = "";

        for(int i = 0;i<hello.length();i++){
            if (hello.charAt(i)=='l'){
                break;
            }
            result = result+ hello.charAt(i);

        }
        System.out.println(result);
        System.out.println("************************************************");

        // I want to sum the numbers from 0 to (50included) but if my sum is over 140 I want to stop

        int sum = 0;
        for (int i =0;i<=50;i++){// i value 0 1 2 3 4 .....50

            sum=sum+i;//+1+2+3+4+5+6+......50
            if (sum>=140){
                break;
            }

        }
        System.out.println("end result "+sum);





    }
}
