package CollectionFrameWork;
import java.util.*;
public class StackMark1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        System.out.println("Enter the number of elements to be oushed in the stack");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter the value");
            String val=s.next();
            // for pushing in the stack
            stack.push(val);
        }

//        size of the stack

        System.out.println(stack.size());

//        System.out.println(stack);

//        peek method for looking at the top of the stack
//        System.out.println(stack.peek());

//        pop function pops the value at the top of stack
        System.out.println("The value popped out of the stack:"+stack.pop());
        System.out.println(stack);


    }
}
