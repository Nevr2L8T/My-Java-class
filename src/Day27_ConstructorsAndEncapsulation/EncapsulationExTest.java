package Day27_ConstructorsAndEncapsulation;

public class EncapsulationExTest {
    public static void main(String[] args) {

    EncapsulatonEx en = new EncapsulatonEx("cavdet","efe");
    en.setssn("345-45-3434");
    en.setSalary(150.000);

        System.out.println("the first name: "+en.Firstname);
        System.out.println("the last name: "+en.Lastname);
        System.out.println("the salary is; "+en.getSalary());
    }
}
