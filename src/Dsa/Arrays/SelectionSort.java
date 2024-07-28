package Dsa.Arrays;
public class SelectionSort {
    public static void selectionSort(int arr[],int no){
        for(int i=0;i<no;i++)
        {
            int min=i;
            for(int j=i+1;j<no;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int tmp=arr[i];
            arr[i]=arr[min];
            arr[min]=tmp;
        }
    }
    public static void bubbleSort(int arr[],int no){
        for(int i=0;i<no;i++){
            for(int j=i+1;j<no;j++){
                if(arr[i]>arr[j])
                {
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
    public static void insertionSort(int arr[],int no){
        for(int i=1;i<no;i++){
            int tmp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>tmp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=tmp;
        }
    }
    public static void main(String[] args) {
        int arr[]={13,22,40,24,52,9,2};
        SelectionSort.insertionSort(arr,arr.length);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
