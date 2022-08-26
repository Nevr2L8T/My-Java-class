package Day28_InheretanceOOP.Extends;

public class Dog extends Animal {

    public int ToothCount;

    public void Shed(){
        System.out.println("Dogs shed");
    }
    public void walk(){
        System.out.println("dogs walk or run");
    }
    public void TeethCount(){
        System.out.println("Dogs tooth count: "+ToothCount);
    }

}
