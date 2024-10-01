package Java_collections;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_framework {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Adding elements in Queue
        queue.offer(12);
        queue.offer(32);
        queue.offer(43);
        queue.offer(54);
        System.out.println(queue);

        //Removing elements from Queue
        queue.poll();
        System.out.println(queue);

        //display the head of the queue
        System.out.println(queue.peek());
    }
}
