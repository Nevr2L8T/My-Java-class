package Day28_InheretanceOOP.Extends.Super;

public class BMW extends Car {

    public double EngineSize;

    public BMW(String make, String mdl, int yr,double size){
        super(mdl,make,yr);
        this.EngineSize = size;
    }
    public void Fly(){
        super.Speed();
        System.out.println(" it also flies");

    }
    public void print(){
        String s = super.display();
        s = s + "the engine size"+EngineSize;
        System.out.println(s);
    }


}
