package DAy30_Exceptions;

public class Topic4_CheckExceptions {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("wait one second");
        try {
        Thread.sleep(1000);
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(2000);
                System.out.println(i);

            }

        }
        catch (InterruptedException ex){
            ex.getStackTrace();

        }


    }
}
