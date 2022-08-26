package Day27_ConstructorsAndEncapsulation;

public class EncapsulatonEx {
    private String ssn;
    private double salary;
    public String Firstname;
    public String Lastname;

    public EncapsulatonEx(String fn,String ln){
        this.Firstname = fn;
        this.Lastname = ln;


    }
    public String getSsn(){
        return ssn;
    }
    public void setssn(String val){
        this.ssn = val;

    }

    public double getSalary() {
        return salary;
    }
    public String setSalary(double salary){
        this.salary = salary;
        return "value for ssn is set";
    }
}
