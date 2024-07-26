package CoreJava;
import java.util.*;
public class OneDArray {
    public static int[] twoSum(int arr[],int target,int no)
    {
        int ans []=new int[2];
        for(int i=0;i<no;i++)
        {
            for(int j=i+1;j<no;j++)
            {
                if(arr[i]>arr[j])
                {
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        int low=0,high=no-1;
        while(low<=high)
        {
            if(arr[low]+arr[high]==target)
            {
                ans[0]=arr[low];
                ans[1]=arr[high];
                return ans;
            }
            else if(target<arr[low]+arr[high])
                high--;
            else
                low++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A[]=new int[100];
        System.out.println("Enter the no of elements");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter the elements");
            A[i]=s.nextInt();
        }
        System.out.println("Enter the target value");
        int target=s.nextInt();
        int result[]=OneDArray.twoSum(A,target,no);
        for(int i=0;i<2;i++)
            System.out.println(result[0]+" "+result[1]);
    }
}
