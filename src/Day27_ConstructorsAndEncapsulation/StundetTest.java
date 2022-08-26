package Day27_ConstructorsAndEncapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StundetTest {
    public static void main(String[] args) {
        Student st1 = new Student("ziya","Yilmaz",89);
        Student st2 = new Student("shanaz","Murad",90.45);
        Student st3 = new Student("sam","Fransois",95);

        ArrayList<Student> listSt = new ArrayList<>();
        listSt.addAll(Arrays.asList(st1,st2,st3));
        for (int i = 0; i <listSt.size() ; i++) {
            if (listSt.get(i).Grade =="A"){
                System.out.println("FirstName "+listSt.get(i).Firstname+" LastName: "+listSt.get(i).Lastname);
            }

        }
        System.out.println("**************************************************");
        ArrayList<StudentInfo> infoList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            StudentInfo st = new StudentInfo();
            infoList.add(st);

        }
        System.out.println("the first zstudent info "+infoList.get(0).name+ infoList.get(0).Score);
        System.out.println("the second student info "+infoList.get(1).name+infoList.get(1).grade);



    }
}
