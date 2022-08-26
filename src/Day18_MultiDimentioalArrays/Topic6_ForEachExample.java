package Day18_MultiDimentioalArrays;

public class Topic6_ForEachExample {
    public static void main(String[] args) {
        int [] nums = {5,6,7,8,9,686,56,4545,334,556,6,5,4,32,};
        // sum all even numbers

        int evensum = 0;
        int oddsum = 0;

        for (int number:nums){
            if (number%2==0){
                evensum=oddsum+number;
            }
            else {
                System.out.println(number);
                oddsum=oddsum+number;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);


    }
}
