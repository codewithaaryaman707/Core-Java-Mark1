package FileHandling;

import java.io.File;

public class FileHandlingMark1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full_Stack_Java_Devlopment\\Core Java Concepts\\Core Java Mark1\\src\\FileHandling\\test.txt");

//        for checking if file exists in the directory or not
//        if not then creating a file
        if(file.exists())
            System.out.println("File exists");
        else
        {
            System.out.println("File is absent");
            try{
                file.createNewFile();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

//        for getting the length of the file.
        System.out.println(file.length());

//        for deleting the file
//        file.delete();
//        System.out.println(file.exists());

    }
}
