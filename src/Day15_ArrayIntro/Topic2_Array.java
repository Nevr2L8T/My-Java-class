package Day15_ArrayIntro;

public class Topic2_Array {
    public static void main(String[] args) {

        int [] values = {3,5,6,7};

        // in order to get the values in the array we use the index
       // values [2]// this will return the 3rd number or value

        System.out.println("the 3rd value is: "+values[2]);//this will print the 3rd value

        System.out.println("the second value in the array is:"+values[1]);//this will return the second value witch is index 1
        System.out.println("*****************************************************************");

        String [] st = {"ziya","sam","bahar","emrah","elief"};

        System.out.println("emrah is :"+st[3]);
        System.out.println("bahar is :"+st[2]);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%55");

        float ziya = 89;
        float [] Fl = {34,87,ziya};
        System.out.println("the third value"+Fl[2]);//index 2 changed ziya value to 89.0
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%55");
             //objet
        int [] numbers ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers);// this will print the hashcode or hash value
        //number[0]===> this will bring 1, which is the first value
        //number[1]===> this will bring 2, which is the first value
        //number[2]===> this will bring 3, which is the first value
        //number[3]===> this will bring 4, which is the first value

        // nuber.length is the size of the array. it will return the number of element or value inside of array
        System.out.println("the size of the array is:"+numbers.length);
        System.out.println("the last index is :"+(numbers.length-1));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%55");

        for (int i = 0; i <numbers.length; i++) {
            System.out.print(" "+numbers[i]);

        }











    }

}
