package ExceptionHandling;
import java.util.Scanner;
public class ExceptionsMark1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b=s.nextInt();
        int a=s.nextInt();
        try
        {
            System.out.println(b/a);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Thike bhai mai chalta hu");
    }
}
