package Day24_ArrayListBulk;

public class Human {

    int age;
    String FirstName;
    String LastName;
    String job;
    String Gender;

    double height;
    double weight;

    public void setEssentials(int insage,String insFirstname, String insLastName){
        age = insage;
        FirstName =insFirstname;
        LastName =insLastName;

    }
    public void SetNonessentals(String insJob, String insGender, double insHeight, double insWeight){
        job = insJob;
        Gender = insGender;
        height = insHeight;
        weight = insWeight;

    }
    public String GetNAme(){
        return FirstName+""+LastName;
    }
    public int GetAge(){
        return age;
    }
    public void printJobAndWeight(){
        System.out.println(job);
        System.out.println(height);
        System.out.println(weight);



    }
}
