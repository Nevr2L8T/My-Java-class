package Day15_ArrayIntro;

public class Day15_HomeWork_15_2 {
    public static void main(String[] args) {

        /*write a code with following requirements
- define an array with following values {90,34,23,87,45,36,98}
- Print the values that can be divided by 2 or 3*/

        int [] pink = {90,34,23,87,45,36,98};


        for (int i = 0; i < pink.length; i++) {
            if (pink[i] % 2 == 0 || pink[i] % 3 == 0) {
                System.out.println("these numbers can be divided by two and three:"+pink[i]);
            }

        }
    }
}
