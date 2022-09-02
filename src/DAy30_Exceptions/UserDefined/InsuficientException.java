package DAy30_Exceptions.UserDefined;

public class InsuficientException extends Exception {
    String message;
    public InsuficientException(){
        this.message = "Insufisient amount";
    }
    public String toString(){
        return message;
    }
}
