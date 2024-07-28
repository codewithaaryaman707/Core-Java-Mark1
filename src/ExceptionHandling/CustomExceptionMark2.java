package ExceptionHandling;
import java.util.*;
class ScientificCalculator{
    public static int addition(int a,int b) throws MaxRange
    {
        if(a>100000||b>100000)
            throw new MaxRange();
        else
            return a+b;
    }
    public static int subtraction(int a,int b) throws MaxRange
    {
        if(a>100000||b>100000)
            throw new MaxRange();
        else
            return a-b;
    }
    public static int product(int a,int b) throws MaxRange
    {
        if(a>100000||b>100000)
            throw new MaxRange();
        else
            return a*b;
    }
    public static double ratio(int a,int b) throws MaxRange,DivisionByZero
    {
        if(a>100000||b>100000)
            throw new MaxRange();
        else
        {
            if(b==0)
                throw new DivisionByZero();
            else
                return a/b;
        }
    }
}
public class CustomExceptionMark2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = s.nextInt();
        System.out.println("Enter the value of b");
        int b = s.nextInt();
        System.out.println();
        try
        {
            System.out.println("The sum of a and b is: "+Calculator.addition(a,b));
            System.out.println();
            System.out.println("The difference of a and b is: "+Calculator.subtraction(a,b));
            System.out.println();
            System.out.println("The product of a and b is: "+Calculator.product(a,b));
            System.out.println();
            System.out.println("The Ratio of a and b is: "+Calculator.division(a,b));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
