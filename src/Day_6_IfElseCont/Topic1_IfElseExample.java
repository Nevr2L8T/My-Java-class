package Day_6_IfElseCont;

public class Topic1_IfElseExample {

    public static void main(String[] args) {
        // water temp is 100 it is boiling
        // water temp is 0 it is freezing
        // water temp is 0<10 so cold
        // water temp between 10-30 will cold
        // water temp 60 -90 hot
        // water temp 90<temp<100 so hot
        // rest of room temp

        String WaterCond;
        int temp =60;

        if (temp == 100){
            WaterCond =  "boiling";
            System.out.println(" The water condition is"+ WaterCond);

        } else if(temp == 0) {        // water temp is 0 it is freezing

            WaterCond = "freezing";
            System.out.println("the water condition is:"+WaterCond);

        }else if (temp>0 && temp<10){
            WaterCond =  "so cold";
            System.out.println(" The water condition is"+ WaterCond);


        }else if (temp>=10 && temp<30){
            WaterCond =  "cold";
            System.out.println(" The water condition is"+ WaterCond);

        }else if (temp<=60 && temp<100){
            WaterCond =  "hot";
            System.out.println(" The water condition is"+ WaterCond);


        }else if (temp>=90 && temp<100){
            WaterCond =  "boiling";
            System.out.println(" The water condition is"+ WaterCond);

        }else {
            WaterCond="room temp";
            System.out.println("the water condition is:"+WaterCond);
        }

    }
}
