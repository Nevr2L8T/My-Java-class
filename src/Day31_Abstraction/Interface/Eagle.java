package Day31_Abstraction.Interface;

public class Eagle implements Animal,Birds{
    String Name;
    String type;
    String Breed;
    int leg;
    int age;
    int winngs;
    @Override
    public void setBreed(String br) {
        this.Breed = br;

    }

    @Override
    public void setLegCount(int lg) {
        this.leg = lg;

    }

    @Override
    public int setAge(int age) {
        this.age =age;
        return 0;
    }

    @Override
    public void Fly() {
        System.out.println("Eagles FLY");

    }

    @Override
    public void Live() {
        System.out.println("Eagles live");

    }

    @Override
    public void WingCount(int wg) {
        this.winngs = wg;

    }
}
