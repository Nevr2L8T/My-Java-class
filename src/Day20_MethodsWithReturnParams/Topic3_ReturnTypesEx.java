package Day20_MethodsWithReturnParams;

public class Topic3_ReturnTypesEx {
    // write a method where it gets an Array of int as input parameter and returns to the max number in array
    public static void main(String[] args) {
        int [] arr1 = {-90,-30,-20,-35};
        int maximum = MAX(arr1);
        System.out.println("the max value is: "+maximum);

    }
    //the method starts here
    public static int MAX(int []justName){
        int max = justName[0];
        for (int a:justName){
            if(max<a){
                max =a;

            }
        }
        return max;
    }


}
