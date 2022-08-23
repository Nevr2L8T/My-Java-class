package HomeWork;

public class Day15_HomeWork_15_1 {
    public static void main(String[] args) {

        /*Write a code with following requirements:
- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
- Print the minimum number in the given array */

        int [] orange = {6,7,2,3,90,-2,-90,-122,96,35};
        int min = orange[0];

        for (int i = 0; i < orange.length; i++) {
            if (min>orange[i]){
                min=orange[i];

            }
        }
        System.out.println("the minimum value is: "+min);


    }
}
