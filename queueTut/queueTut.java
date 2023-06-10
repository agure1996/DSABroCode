package queueTut;

import java.util.LinkedList;
import java.util.Queue;

public class queueTut {

    /**Queue Data Structures
     * FIFO - First in First Out (Imagine a queue line of people)
     * A collection designed for holding elements prior to processing Linear Data Structures
     * 
     * add value= enqueue, offer()
     * remove value= dequeue, poll()
     * peek head value peek()
     */
    

     public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>(); 
        
        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Jimmy");
        queue.offer("Johnson");
        
        String name = queue.poll();
        String peek = queue.peek();
        System.out.println(queue);
        System.out.println(name);
        System.out.println(peek);
        
        /**Queues uses:
         * 
         * Keyboard buffer - Letters appearing on-screen in order they are pushed
         * Printer queue = Completing print jobs in the order
         * Used in LinkedLists, Priority Queues, Breadth-first Search
         */
        
     }
}
