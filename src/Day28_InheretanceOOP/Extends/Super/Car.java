package Day28_InheretanceOOP.Extends.Super;

public class Car {
    public String Model;
    public String Make;
    public int year;

    public Car(String model,String make,int year){
       this.Model = model;
       this.Make = make;
       this.year = year;
    }
    public void Drive(){
        System.out.println("Cars Drive");
    }
    public void Speed() {
        System.out.println("cars speed up");
    }
    public String display(){

            return "Model :"+Model+" Make: "+Make+" year: "+year;


    }


}
