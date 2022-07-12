package day14NestedForLoops;

public class Topic1NestedForLoops {
    public static void main(String[] args) {

       /* Loop {// outer loop
              gjhgljghgg
              loop{ // inner loop
              jhehfrehr
              }
           }
        */
        int weeks =3;

        int days = 7;

        for (int i = 1; i<=weeks;i++){
        System.out.println("week "+i);//outer loop

        for (int j=1;j<= days;j++){//inner loop
           System.out.println("     Days:"+j);

        }

        }



    }
}
