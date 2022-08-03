package Day18_MultiDimentioalArrays;

public class Topic1_multiArrays {
    public static void main(String[] args) {
        //arrays having arrays as values or having multiple array nested inside each other
        //DAta type [] name = {.............}
        //Data type[] [][] name = { {....} {.... } }

        int [] [] name1 = { {12,34,56,78} ,  {78,89,23,11} };
        // index outer array   0                  1
        // inside array      0 1 2 3          0 1 2 3
        int b = name1 [1] [2];

        //int [] normal ={1,2,3,4};
       //int a = normal[3];

        System.out.println(name1[1][1]);

        int [] [] [] tr = { {{5,5,6,7,3,7,}  ,{0,5,6,7,2,4}},          {{0,7,8,5,3,7,}  ,{23,65,4874}},                 {  {0,54,67,89}  ,{98,56,75 } }  };
        //the first array          0                                                    1                                         2
        // the second              0               1                           0               1                                   0             1
        // the third           012345            012345                    012345           012                                0123          012





    }
}
