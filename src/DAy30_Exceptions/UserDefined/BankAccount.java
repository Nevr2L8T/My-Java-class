package DAy30_Exceptions.UserDefined;

public class BankAccount {
    double balance;
    public BankAccount(double blnc){
        this.balance = blnc;
    }
    public void Deposit(double amnt){
        balance = balance+amnt;
        System.out.println("The new balance is: "+balance);
    }
    public void Withdraw(double amount)throws InsuficientException{
        if (balance< amount){
            throw new InsuficientException();
        }
        else {

        balance = balance - amount;
        System.out.println("The new balance is: "+balance);
        }

    }
}
