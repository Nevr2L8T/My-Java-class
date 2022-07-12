package Day_7_Switch_Scanner;

public class Topic4_SwitchStatments {
    public static void main(String[] args) {

        int num = 10;
        String Month = "";
        switch (num){
            case 2: Month = "feb";
            break;
            case 3: Month = "mar";
                break;
            case 4: Month = "arp";
                break;
            case 5: Month = "may";
                break;
            case 6: Month = "jun";
            break;

            case 7: Month = "jul";
            break;
            case 8: Month = "aug";
            break;
            case 9: Month = "sep";
            break;
            case 10: Month = "oct";
            break;
            case 11: Month = "nov";
            break;
            case 12: Month = "dec";
            break;


        }
        System.out.println("month\t"+Month);
    }
}
