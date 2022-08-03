package Day17_ArrayEquals;

import java.util.Arrays;

public class Topic1_ArrayEquals {
    //Arrays are objects, they contain multiple values for us
    //In order for 2 arrays to be equal they should have the same value in the same order
    public static void main(String[] args) {
    int [] arr1={1,2,3,4};
    int [] arr2 ={1,2,3,4};
        //System.out.println("The arr1 :"+arr1);
        //System.out.println("The arr2 :"+arr2);
        System.out.println("**********************************");

        boolean eq = Arrays.equals(arr1,arr2);
        System.out.println("Are those 2 arrays equal: "+eq);
        System.out.println("*********************************");

        float [] arr3 ={2.1f,3.5f,5.0f};
        float [] arr4 ={2.0f,3.5f,5.0f};
        System.out.println("are they equal: "+Arrays.equals(arr3,arr4));
        System.out.println("**********************************");

        int [] arr5 = {4,5,6,3};
        int [] arr6 =arr5;
        System.out.println("arr6 :"+Arrays.toString(arr6));
        System.out.println("arr5 :"+Arrays.toString(arr5));



    }


}
