package DAy30_Exceptions.UserDefined;

public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.Deposit(900);

        try {
        account.Withdraw(1500);

        }
        catch (InsuficientException e){
            System.out.println(e.toString());
        }

    }
}
