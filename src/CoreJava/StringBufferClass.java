package CoreJava;
import java.util.*;
public class StringBufferClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuffer stringbuffer = new StringBuffer("Aditya");
//        System.out.println(stringbuffer);

//        StringBuffer Functions

//        1) Length of StringBffer
//        System.out.println(stringbuffer.length());

//        2) finding another stringbuffer

        StringBuffer string1 = new StringBuffer("Adi");
        StringBuffer string2 = new StringBuffer("Aditya");
//        if(string1.toString().contains(string2.toString()))
//            System.out.println("string 1 is present in string 2");
//        else
//            System.out.println("string 1 is not present in String 2");

//        3)comparefunction

//        if(string1.toString().compareTo(string2.toString())==0)
//            System.out.println("Strings are equal");
//        else if(string1.toString().compareTo(string2.toString())>0)
//            System.out.println("String 1 is bigger than String 2");
//        else
//            System.out.println("String 2 is bigger than string 1");

//        4) insert and append function

        StringBuffer string3 = new StringBuffer("Kelaskar");
//        System.out.println(string1.append(string3));
//        System.out.println(string1.insert(3,string3));

//        5) remove from string buffer

//        string3.delete(4,7);
//        string3.deleteCharAt(3);
//        System.out.println(string3);

//        6) substring from another string

//        String string4= string3.substring(4);
//        System.out.println(string4);
//        string4=string3.substring(0,4);
//        System.out.println(string4);

//        7) reverse functions
        System.out.println(string3.reverse());


    }
}
