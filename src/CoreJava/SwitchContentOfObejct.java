package CoreJava;
import java.util.*;
public class SwitchContentOfObejct {
    public static void printSudten(Student student)
    {
        System.out.println("The sid of the Student is:"+student.sid);
        System.out.println("The name of the Student is:"+student.name);
        System.out.println("The roll no of the Student is:"+student.roll_no);
        System.out.println("The div of the Student is:"+student.div);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student student[] = new Student[2];
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter details of Student "+(i+1));
            System.out.println("Enter the sid of the Student");
            String sid=s.next();
            System.out.println("Enter the name of the Student");
            String name=s.next();
            System.out.println("Enter the roll no of the Student");
            int roll_no=s.nextInt();
            System.out.println("Enter the Div of Student");
            char div=s.next().charAt(0);
            student[i]=new Student(sid,name,roll_no,div);
        }
        Student student1 = student[0];
        Student student2 = student[1];
        System.out.println("Before swaping the content");
        Student.printStudent(student1);
        Student.printStudent(student2);
        System.out.println("After swaping the content");
        Student tmp = student1;
        student1=student2;
        student2=tmp;
        Student.printStudent(student1);
        Student.printStudent(student2);
    }
}
