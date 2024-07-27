package Oops.Encapsulation;
import java.util.*;
public class Point {
    public double xCo,yCo;
    public Point(double xCo,double yCo)
    {
        this.xCo=xCo;
        this.yCo=yCo;
    }
    public Point()
    {

    }
    public static double distance(Point p1,Point p2)
    {
        double distance=0.0;
        double part1=Math.pow((p2.xCo-p1.xCo),2);
        double part2=Math.pow((p2.yCo-p1.yCo),2);
        distance= Math.pow(part1+part2,0.5);
        return distance;
    }
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     Point point[]=new Point[2];
     for(int i=0;i<2;i++)
     {
         System.out.println("Enter the co-ordinates of "+(i+1)+" st co-ordinates.");
         double xCo=s.nextDouble();
         double yCo=s.nextDouble();
         point[i]=new Point(xCo,yCo);
     }
        System.out.println("the distance between points p1 and p2 is:"+Point.distance(point[0],point[1]));
    }
}
