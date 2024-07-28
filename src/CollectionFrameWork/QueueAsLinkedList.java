package CollectionFrameWork;
import java.util.*;
public class QueueAsLinkedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        System.out.println("Enter the no of elements");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter the element");
            int element = s.nextInt();
            queue.offer(element);
        }
        System.out.println(queue);

//         peeks the element at the head
        System.out.println(queue.peek());

//        removing an element
//        queue.remove(1);
        queue.poll();
        System.out.println(queue);

    }
}
