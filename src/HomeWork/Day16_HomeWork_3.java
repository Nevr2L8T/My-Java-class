package HomeWork;

public class Day16_HomeWork_3 {
    public static void main(String[] args) {
        /*Write a code where user is asked to enter for 5 employee salaries and store those salaries
Then find the average salary of those 5 employees*/
        int[] salarie ={250,356,235,745,765};
        int sum = 0;
        for (int i = 0; i <salarie.length; i++) {
            sum+=salarie[i];
            
        }
        float average = (float) sum/salarie.length;
        System.out.println("The average salary is: "+average);
    }
}
