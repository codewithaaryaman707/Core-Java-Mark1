package CollectionFrameWork;

import java.net.Inet4Address;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetMark1 {
    // Hashset is an unordered collection of unique element
    // LinkedsHashset stores in sorted order
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Decleration and Initialization
        HashSet<Integer> hashSet = new HashSet<Integer>();

        // input
        System.out.println("Enter the no of elements to be entered in the set");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter the elements");
            int value = s.nextInt();
            hashSet.add(value);
        }
        System.out.println(hashSet);

        // size of set
        System.out.println(hashSet.size());

        // for removing an element from set

//        System.out.println("Enter the element to be removed from the set");
//        int value = s.nextInt();
//        hashSet.remove(value);
//        System.out.println(hashSet);

        // for checking if the element exists in the set or not.

        System.out.println("Enter the element to be searched in the set or not");
        int value = s.nextInt();
        System.out.println(hashSet.contains(value));
    }
}
