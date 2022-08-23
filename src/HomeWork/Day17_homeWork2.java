package HomeWork;

import java.util.Arrays;

public class Day17_homeWork2 {
    public static void main(String[] args) {
        /*Write a code where you short all the integer values in an array in descending order (Do not use the Arrays.short() )*/
        int [] ar =new int[]{30,2,45,455,87,97,1,0,64};

        for (int i = 0; i < ar.length; i++)
        {
            for (int j = i+1; j < ar.length; j++)
            {
                int tmp =0;
                if (ar[i] >ar[j])
                {
                    tmp=ar[i];
                    ar[i] =ar[j];
                    ar[j] = tmp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i]+", ");

        }
    }
}



