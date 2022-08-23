package HomeWork.HomeWork;

public class IfElseHomeWork {
    public static void main(String[] args){

        double bill = 25;
        double tip1 = bill*.10;
        double tip2 = bill* .20;
        double total = bill+tip1;
        double total2 = bill+tip2;

        if (bill>99 || bill<280){
            System.out.println("The bill was,"+bill+"\tThe tip was,"+tip1+"\ttotal was,"+total);

        }else{
            System.out.println("The bill was,"+bill+"\tThe tip was,"+tip2+"\tTotal was,"+total2);

        }
        double bill2 = 97;
        double Tip1 = bill2*0.10;
        double Tip2 = bill2*.20;
        double totalbill1 = bill2+Tip1;
        double totalbill2 = bill2+Tip2;

        if (bill2>99 || bill2<280){
            System.out.println("The bill was,"+bill2+"\tThe tip was,"+Tip1+"\ttotal was,"+totalbill1);
        }



    }
}



















