package CollectionFrameWork;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class PriorityQueueMark1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Same as implementing linked list as a queue
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();  // minimum priiority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());  // maximum order priority queue
        System.out.println("Enter the no of elements for the priority queue");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter the element");
            int value = s.nextInt();
            priorityQueue.offer(value);
        }
//        System.out.println(priorityQueue);

//        for peeking the element at front
//        priorityQueue.peek();

//        for removing the elemet at the front

//        priorityQueue.poll();
//        System.out.println(priorityQueue);

//        for removing an element

//        System.out.println("Enter the element to be removed from priority queue");
//        int element = s.nextInt();
//        priorityQueue.remove(element);
//        System.out.println(priorityQueue);
    }
}
