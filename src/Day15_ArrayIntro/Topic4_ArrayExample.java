package Day15_ArrayIntro;

public class Topic4_ArrayExample {
    public static void main(String[] args) {
        int []numbers = new int[4];//init numbers {0,0,0,0,} default value
      /*  numbers[0]=3;
        numbers[1]=5;
        numbers[2]=90;
        numbers[3]=23;*/
        //this is the manual way to assign values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+5;

        }
    }
}
