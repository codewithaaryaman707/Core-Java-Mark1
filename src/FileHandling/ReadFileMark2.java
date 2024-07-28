package FileHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class ReadFileMark2 {
//    using BufferedReader class
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full_Stack_Java_Devlopment\\Core Java Concepts\\Core Java Mark1\\src\\FileHandling\\test.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            System.out.println(reader.readLine());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
