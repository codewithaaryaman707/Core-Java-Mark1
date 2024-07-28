package FileHandling;
import java.io.File;
import java.util.Scanner;

public class ReadFileMark1 {
//    using Scanner class for reading the file
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full_Stack_Java_Devlopment\\Core Java Concepts\\Core Java Mark1\\src\\FileHandling\\test.txt");
        try {
            Scanner s = new Scanner(file);
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
