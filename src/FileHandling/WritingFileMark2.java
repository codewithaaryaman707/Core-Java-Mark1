package FileHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class WritingFileMark2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        using Buffered Reader Class
        File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full_Stack_Java_Devlopment\\Core Java Concepts\\Core Java Mark1\\src\\FileHandling\\test.txt");
        BufferedWriter bufferedWriter=null;
        try{
            FileWriter fileWriter = new FileWriter(file,true);
             bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("Enter the data to added to the file");
             String input = s.nextLine();
             bufferedWriter.write(input);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }
}
