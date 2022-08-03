package Day18_MultiDimentioalArrays;

public class Topic2_MultidementionalArraysExample {
    public static void main(String[] args) {
         String [] [] Stnames = {{"barhar","gulay"},   {"ziya"},       {"raz","kubra","sarp"},    {"sam","arivan"}};
        System.out.println(Stnames[3][1]);

        int [] one = new int [3] ;//{0,0,0}
        int [][] two = new int [3][3];// {{0,0,0,},{0,0,0},{0,0,0}}

        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[0].length; j++) {
                two[i][j] = two[i][j]+5;
                System.out.println(i+   j+  two[i][j]);

            }

        }
    }
}
