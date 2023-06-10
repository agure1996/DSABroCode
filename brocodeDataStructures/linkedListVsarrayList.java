package brocodeDataStructures;
import java.util.LinkedList;
import java.util.ArrayList;

public class linkedListVsarrayList {
    
    /** Following is to compare LinkedList speed vs an Arraylist
     * We will compare multiple functions of linkedlist and arraylists
     */
    public static void main(String[] args) {

        /*instantiating both ArrayList and Linked List first */

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        /** Instantiate the time variables we will use to compare them both */
        long startTime;
        long stopTime;
        long lapseTime;


        for (int i=0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
                        /** Linked-List */

                            /*The start */

                    startTime = System.nanoTime();

                    //  linkedList.get(999999);
                    linkedList.remove(250000);
                     /**The end of the process */
                    
                    stopTime = System.nanoTime();

                    /**The endtime - start time */

                    lapseTime = stopTime-startTime;
                    
                    System.out.println("LinkedList: \t" + lapseTime + " ns");
                    
                        /** Array-List */
                        
                              /*The start */

                        startTime = System.nanoTime();
                        // arrayList.get(999999);
                        arrayList.remove(250000);
                    /**The end of the process */
                   
                   stopTime = System.nanoTime();

                   /**The endtime - start time */

                   lapseTime = stopTime-startTime;
                   
                   System.out.println("ArrayList: \t" + lapseTime + " ns");
    }
}
