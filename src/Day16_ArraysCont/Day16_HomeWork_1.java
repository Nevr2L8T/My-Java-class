package Day16_ArraysCont;

public class Day16_HomeWork_1 {
    public static void main(String[] args) {
        /*Write   a   statement   that   declares   a   string   array   initialized   with   the   following   strings:
"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
Write   a   loop   that   displays   the   contents   of   each   element   in   the   array   that   you   declared.  */
        String [] days ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for (int i = 0; i <days.length ; i++) {

            System.out.println("* "+days[i]);
        System.out.println("--------------------");
        }
        System.out.println("Days of the week");
    }
}


