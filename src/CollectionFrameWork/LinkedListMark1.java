package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListMark1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Decleration
        LinkedList<Integer> arraylist = new LinkedList<Integer>();

        // input
        System.out.println("Enter the no of elements");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter the elements");
            int val = s.nextInt();
            arraylist.add(val);
        }
        // output
//        System.out.println(arraylist);

//        size of arraylist
//        System.out.println(arraylist.size());

        //1) insert at position

//        arraylist.add(1,100);
//        System.out.println(arraylist);

        // 2)remove function

//        arraylist.remove(4);
//        arraylist.remove(Integer.valueOf(100));
//        System.out.println(arraylist);

        // 3)for clearing the list

//        System.out.println(arraylist);
//        arraylist.clear();
//        System.out.println(arraylist);

//        4)update function

//        System.out.println(arraylist);
//        arraylist.set(2,100);
//        System.out.println(arraylist);

//        5) contains function

//        System.out.println(arraylist);
//        System.out.println(arraylist.contains(100));

//        6) iterating through List

//        for(int value:arraylist)
//            System.out.print(value+" ");

//        7)adding another arraylist

//        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
//        arrayList1.add(10);
//        arrayList1.add(20);
//        arrayList1.add(30);
//        arrayList1.add(40);
//        arrayList1.add(50);
//        arraylist.addAll(arrayList1);
//        System.out.println(arraylist);
    }
}
