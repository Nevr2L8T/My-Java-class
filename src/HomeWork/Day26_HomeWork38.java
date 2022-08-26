package HomeWork;

public class Day26_HomeWork38 {
    /*Write a Class named "Login" where it has private data members of String Username and String Password.
Create another Class where you create instance (Object) of Login class,  set those private data members Then Print Those Values*/
    public static void main(String[] args) {
        Login Ln = new Login();
        Ln.setPassword("Hello World");
        Ln.setUserName("Rachel's Homework");
        System.out.println("The password is: "+Ln.getPassword());
        System.out.println("The username is: "+Ln.getUserName());
    }

}
