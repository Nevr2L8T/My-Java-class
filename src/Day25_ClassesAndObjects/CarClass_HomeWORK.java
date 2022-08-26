package Day25_ClassesAndObjects;

import java.util.ArrayList;
import java.util.Arrays;

public class CarClass_HomeWORK {
    /*Write a Car Class where it has following attributes:
1) Model
2) Year
3) Speed
and following method:
1) SetAttributes()-  Where it takes String Model, int Year and double speed to set all the instance attribute.
2) PrintCar() - Where it prints each objects attributes
3) IncreaseSpeed() - Where it takes double values and it increase the Speed attribute by input amount
4) DecreaseSpeed() - Where it takes double values and it decrease the Speed attribute by input amount

Create 4 instance of Car Class, after Setting the Attribute values,
 Apply increaseSpeed and DecreaseSpeed Multiple times for different values.
  For those which has speed of 80 or more, Print warning such as "Car "Model" and"Speed" is danger of getting ticket"
     */
    String Model;
    int Year;
    double speed;

    public void SetAttributes(String mod,int yr,double sp){
        Model = mod;
        Year = yr;
        speed = sp;

    }
    public void PrintCar(){
        System.out.println("Model: "+Model+"Year: "+Year+"Speed: "+speed);
    }
    public void IncreaseSpeed(double increase){
        speed += increase;
    }
    public void DecreaseSpeed(double decrease){
        speed -= decrease;
    }

    public static void main(String[] args) {
        CarClass_HomeWORK car1 = new CarClass_HomeWORK();
        car1.SetAttributes("Ford",2018,75);

        CarClass_HomeWORK car2 = new CarClass_HomeWORK();
        car2.SetAttributes("Bugatti",2022,85.7);

        CarClass_HomeWORK car3 = new CarClass_HomeWORK();
        car3.SetAttributes("BMW",2020,65.2);

        CarClass_HomeWORK car4 = new CarClass_HomeWORK();
        car4.SetAttributes("Honda",2019,82.5);

        car1.IncreaseSpeed(10);
        car1.DecreaseSpeed(25);
        car2.IncreaseSpeed(15);
        car2.DecreaseSpeed(5);
        car3.IncreaseSpeed(20);
        car3.DecreaseSpeed(40);
        car4.IncreaseSpeed(12);
        car4.DecreaseSpeed(6);

        ArrayList<CarClass_HomeWORK> Speed = new ArrayList<>();
        Speed.addAll(Arrays.asList(car1,car2,car3,car4));

        for (int i = 0; i <Speed.size() ; i++) {
            Speed.get(i).PrintCar();
            if(Speed.get(i).speed >= 80){
                System.out.println("In danger of getting a ticket!");
            }
            else {
                System.out.println("You are good to go");
            }

        }

    }

}
