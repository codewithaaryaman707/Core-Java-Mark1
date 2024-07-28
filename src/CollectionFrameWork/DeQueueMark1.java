package CollectionFrameWork;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class DeQueueMark1 {
    // Dequeue stands for doubly ended queue.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Initialization
        Deque<Integer> deque = new ArrayDeque<Integer>();

//        for adding the elements in the queue
        System.out.println("Enter the no of elements to be entered in the queue");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter the element");
            int value=s.nextInt();
            deque.add(value);
        }
        System.out.println(deque);

//        elements can be added from front as well as rare
        deque.addFirst(100);
        deque.addLast(100);
        System.out.println(deque);

//        for peeking the element at the front and the rare
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

//        for removing the element at the front and rare
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

    }
}
