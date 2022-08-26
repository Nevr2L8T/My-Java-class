package Day25_ClassesAndObjects;

public class ShoeClassAndInstance {
    double size;
    String color;
    String Brand;

    public void Print(){
        System.out.println("The shoe is: "+Brand+ "size: "+size+ "The color: "+color);
    }
    public double IncreasSize(double a){
        size = size+a;
        return size;

    }
    public void changeColor(String clr){
        color = clr;
    }

    public static void main(String[] args) {
        ShoeClassAndInstance Shoe1 = new ShoeClassAndInstance();
        Shoe1.Brand = "Nike";
        Shoe1.color = "Red";
        Shoe1.size = 9.5;
        Shoe1.Print();

        double newSize = Shoe1.IncreasSize(1.5);
        System.out.println("the new size is: "+newSize);
        System.out.println(Shoe1.size);

        Shoe1.changeColor("blue");
        Shoe1.Print();

    }


}
