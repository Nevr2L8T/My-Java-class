package Day21_MethodsAndMethodsOverload;

public class Topic1_MethodsExample {
    public static void main(String[] args) {
        String how = "mid";
        onOff("on");
        addButter(4);
        Wait(4);
        System.out.println(Eggs(5));
        Scrum();
        if (how.equalsIgnoreCase("mid")){
            Wait(4);
        }
        else {
            Wait(6);
        }
        System.out.println("the omlet is done");
        System.out.println("**************************************************************");
        Scrum();





    }
    public static void onOff(String onoff){
        if(onoff.equalsIgnoreCase("on")){
            System.out.println("the stove is on ");
        }
        else {
            System.out.println("the stove is off ");

        }

    }
    public static void addButter(int people){
        if(people<=2){
            System.out.println("2 mg added to pan");
        }
        else if (people>2 && people<5){
            System.out.println("4 mg added to the pan");

        }
        else{
            System.out.println("8 nmg butter added to the pan");
        }
    }
    public static String Eggs(int eggs){
        return eggs+"of eggs added";

    }
    public static void Scrum(){
        System.out.println("scamble the eggs");
        System.out.println(Eggs(65));
    }
    public static void Wait(int mins){

        for (int i=0; i<mins;i++){
            System.out.println("one min passed");

        }
        System.out.println(mins+" is done");
    }

}
