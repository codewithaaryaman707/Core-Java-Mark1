package CoreJava;
public class VaragsParameter {
    public static int sum(int a,int ...A)
    {
        int sum=0;
        sum+=a;
        for(int value:A)
            sum+=value;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(VaragsParameter.sum(1,0,1,2,3));
    }
}
