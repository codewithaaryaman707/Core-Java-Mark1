package FileHandling;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
public class WritingFileMark1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // using fileinput stream class
        File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full_Stack_Java_Devlopment\\Core Java Concepts\\Core Java Mark1\\src\\FileHandling\\test.txt");
        FileOutputStream stream=null;
        try{
            stream = new FileOutputStream(file,true);
            System.out.println("Enter the data to be entered in the file");
            String data = s.nextLine();
            char dataArray[] = data.toCharArray();
            int i=0;
            while(i<dataArray.length){
                stream.write(dataArray[i]);
                i++;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                stream.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
