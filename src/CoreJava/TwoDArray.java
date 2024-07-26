package CoreJava;
import java.util.*;
public class TwoDArray {
    public static int[][] additionmatrix(int arr1[][],int arr2[][],int rows,int cols)
    {
        int arr3[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
                arr3[i][j]=arr1[i][j]+arr2[i][j];
        }
        return arr3;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr1[][] = new int[100][100];
        int arr2[][] = new int[100][100];
        int arr3[][];
        int rows=s.nextInt();
        int cols=s.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
                arr1[i][j]=s.nextInt();
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
                arr2[i][j]=s.nextInt();
        }
        arr3=new int[100][100];
        arr3=additionmatrix(arr1,arr2,rows,cols);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
                System.out.print(arr3[i][j]+" ");
            System.out.println();
        }
    }
}
