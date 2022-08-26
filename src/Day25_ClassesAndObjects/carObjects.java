package Day25_ClassesAndObjects;

import java.util.ArrayList;
import java.util.Objects;

public class carObjects {
    public static void main(String[] args) {
        carClass car1 = new carClass();
        car1.setStringValues("Toyota","camrey","grey");
        car1.setYear(2020);
        car1.Miles = 190.89;
        System.out.println(car1.toString());
        System.out.println(car1.Model);

        carClass car2 = new carClass();
        car2.Brand = "suaru";
        car2.Model = "imprezza";
        car2.year = 2021;
        car2.Miles = 2000.95;
        System.out.println(car2.toString());

        carClass [] obj= {car1,car2};
        System.out.println(obj[0].Model);

        ArrayList<carClass> Objects = new ArrayList<>();
        Objects.add(car2);
        Objects.add(car1);
        System.out.println("*************************************************************");
        Objects.get(1);

        carClass obj1 = obj[0];
        System.out.println("----------------------------------------------------");
        System.out.println(obj1.Model);

        carClass obj2 = Objects.get(1);
        System.out.println(obj2.year);



    }
}
