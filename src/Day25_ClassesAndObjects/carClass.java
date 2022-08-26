package Day25_ClassesAndObjects;

import java.time.Year;

public class carClass {

    String Brand;
    String Model;
    int year;
    String Color;
    double Miles;

    public void setStringValues(String brnd,String mdl,String clr){
        Brand = brnd;
        Model = mdl;
        Color = clr;

    }
    public void setYear(int yr){
        year = yr;

    }
    public String toString(){
        String car = "Brand: "+Brand +"Model: "+Model+ "year" + year+"Miles: "+Miles;
        return car;

    }


}
