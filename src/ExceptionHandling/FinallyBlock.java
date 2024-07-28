package ExceptionHandling;
import java.util.Scanner;
public class FinallyBlock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double result=0.0;
        System.out.println("Enter the value of a");
        int a = s.nextInt();
        System.out.println("Enter thr value of b");
        int b = s.nextInt();
        Calculator calculator = new Calculator(a,b);
        try {
            result=Calculator.division(a,b);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("The ratio of a and b is:"+result);
        }
    }
}
