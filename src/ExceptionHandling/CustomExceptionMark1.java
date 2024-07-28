package ExceptionHandling;
import java.util.Scanner;
class MaxRange extends Exception
{
    @Override
    public String toString() {
        return "Enter a number less than 100000";
    }

    @Override
    public String getMessage() {
        return "Enter a number less than 100000";
    }
}
class DivisionByZero extends Exception
{
    @Override
    public String toString() {
        return "Enter a denominator greater than 0";
    }

    @Override
    public String getMessage() {
        return "Enter a denominator greater than 0";
    }
}
class Calculator
{
    public int a,b;
    public Calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public Calculator()
    {

    }
    public static int addition(int a,int b)
    {
        int sum=0;
        if(a>100000||b>100000)
        {
            try{
             throw new MaxRange();
            }
            catch(MaxRange e)
            {
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        else
            sum=a+b;
        return sum;
    }
    public static int subtraction(int a,int b)
    {
        int diff=0;
        if(a>100000||b>100000)
        {
            try{
                throw new MaxRange();
            }
            catch(MaxRange e)
            {
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        else
            diff=a-b;
        return diff;
    }
    public static int product(int a,int b)
    {
        int product=0;
        if(a>100000||b>100000)
        {
            try{
                throw new MaxRange();
            }
            catch(MaxRange e)
            {
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        else
            product=a*b;
        return product;
    }
    public static double division(int a,int b)
    {
        double division=0;
        if(a>100000||b>100000)
        {
            try{
                throw new MaxRange();
            }
            catch(MaxRange e)
            {
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        else{
            if(b==0)
            {
                try{
                    throw new DivisionByZero();
                }
                catch(Exception e)
                {
                    System.out.println(e.toString());
                    e.printStackTrace();
                }
            }
            else division=a/b;
        }
        return division;
    }
}
public class CustomExceptionMark1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = s.nextInt();
        System.out.println();
        System.out.println("Enter the value of b");
        int b = s.nextInt();
        System.out.println();
        System.out.println("The sum of a and b is: "+Calculator.addition(a,b));
        System.out.println();
        System.out.println("The difference of a and b is: "+Calculator.subtraction(a,b));
        System.out.println();
        System.out.println("The product of a and b is: "+Calculator.product(a,b));
        System.out.println();
        System.out.println("The Ratio of a and b is: "+Calculator.division(a,b));
    }
}
