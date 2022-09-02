package DAy30_Exceptions;

public class Topic2_ExceptionnVsError {
    public void infinate(int num){
        while (num>0){
            num+=1;
            infinate(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {7,8,9,10};
        System.out.println(nums[3]);
        try {
        int a =nums[2];
            System.out.println(a);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index seven is not there");

        }
        System.out.println("this is the code");
    }
}
