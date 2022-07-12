package Day_9_Strings;public class Home_workJuly13 {
    public static void main(String[] args) {

        //First create one string and copy paste below paragraf.
        //And make modifications on the given paragraph listed below.
        //Make sure to create multiple string with each sentence from given paragraph
        //Make sure each sentence start with upper case letter.
        //Make sure city name start with the capital letter.
        //Make sure the rest of the letters are lower case.
        //Make sure to change the name, age and city information based on your information
        //make sure to get rid of the empty spaces in front and end of the sentences.
        //after you make the modification check each sentense’s length
        //Print each sentence and make sure they are correctly modified.
        //Print 1st, 4th and 5th indexed characters for each sentence
        //At the end combine all the sentence to get proper paragraph with modified sentences


        String str1 = "  hello my name is <yourname>.";
        String str2 = " i am <yourage> years old.";
        String str3 = " i live in <yourcity>.";
        String str4 = "  I have been in IT industry for about 6 years.";
        String str5 = " I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing.";
        String str6 = " I have experience in EducatION, energy,finance and some manY Other AREAs.";
        String str7 = " i HAve scrum master and Oracle java Programmer certificates.";
        String str8 = "i love JaVA. ";
        String str9 = " I designed and DEVELoped many automation test cases using BDD FRamework.";


        System.out.println(str1.replace("h","H").replace("<yourname>","Rachel").trim());
        System.out.print(str2.replaceFirst("i","I").replace("<yourage>","Forty Seven").trim());
        System.out.print(str3.toLowerCase().replaceFirst("i","I").replace("<yourcity>","Nashville").trim());
        System.out.println(str4.trim());
        System.out.print(str5.toLowerCase().replaceFirst("i","I").replace("now i am","now I am").trim());
        System.out.println(str6.toLowerCase().replaceFirst("i","I").trim());
        System.out.print(str7.toLowerCase().replace("i","I").trim());
        System.out.print(str8.toLowerCase().replace("i","I").trim());
        System.out.println(str9.toLowerCase().replaceFirst("i","I").trim().replace("bdd","BDD"));

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("The sentence's length is: ");

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str4.length());
        System.out.println(str5.length());
        System.out.println(str6.length());
        System.out.println(str7.length());
        System.out.println(str8.length());
        System.out.println(str9.length());
        System.out.println("****************************************");

        System.out.println(str1.charAt(1)+""+str1.charAt(4)+""+str1.charAt(5));
        System.out.println(str2.charAt(1)+""+str2.charAt(4)+""+str2.charAt(5));
        System.out.println(str3.charAt(1)+""+str3.charAt(4)+""+str3.charAt(5));
        System.out.println(str4.charAt(1)+""+str4.charAt(4)+""+str4.charAt(5));
        System.out.println(str5.charAt(1)+""+str5.charAt(4)+""+str5.charAt(5));
        System.out.println(str6.charAt(1)+""+str6.charAt(4)+""+str6.charAt(5));
        System.out.println(str7.charAt(1)+""+str7.charAt(4)+""+str7.charAt(5));
        System.out.println(str8.charAt(1)+""+str8.charAt(4)+""+str8.charAt(5));
        System.out.println(str9.charAt(1)+""+str9.charAt(4)+""+str9.charAt(5));






    }
}
