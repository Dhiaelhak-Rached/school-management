package school;

import java.util.ArrayList;
import java.util.List;
public class App {
    
    public static void main(String[] args) throws Exception {
        teacher t1 =new teacher(1, "Aziz", 5000);
        teacher t2 =new teacher(2, "rami", 5000);
        List<teacher> teacherList= new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);

        student s1 =new student(4, "sami", 4);
        student s2 =new student(5, "sami", 4);
        List<student> studentList= new ArrayList<>();
        
        studentList.add(s1);
        studentList.add(s2);
        school school1=new school(teacherList, studentList);
        System.out.println("TotalMoneyEarned"+school1.getTotalMoneyEarned());
        school1.UpdateTotalMoneyEarned(25);
        System.out.println("TotalMoneyEarned"+school1.getTotalMoneyEarned());
        s1.payFees(5000);
        
        System.out.println(s1.remainingFees());
    }
}
