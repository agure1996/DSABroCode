package PriorityQueue;




import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    
    public static void main(String[] args) {
        
        /*Priority Queue = FIFO data structures that reves elements
         * in highest priority first before elements with lower priority 
         */ 

         Queue<Double> gpaQ = new PriorityQueue<>(Collections.reverseOrder());

         gpaQ.offer(12.12);
         gpaQ.offer(13.12);
         gpaQ.offer(18.12);
         gpaQ.offer(16.12);
         gpaQ.offer(12.11);

        

         while (!gpaQ.isEmpty()){

            for (int i=0; i<=gpaQ.size();i++){

                System.out.println(gpaQ.poll());
                
            }
         }
         
    }
}
