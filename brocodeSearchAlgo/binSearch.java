package brocodeSearchAlgo;


// import java.util.Arrays;

public class binSearch {
    
    public static void main(String[] args) {

    /* Binary search


    
     * 
     * Search Algorithm that finds the position of a target value within a sorted array
     * during each step, half the array is eliminated hence why it relies on a sorted array
     * 
     * during each step we start at the middle of the array and check if value is lower 
     * or higher than the middle value, depending on the answer half the array of values are removed
     * 
     * rinse and repeat
     * 
     * binary search efficiency increases with larger array of elements
     * 
     * hence its TC being - O(log n)
     */

    int[] array = new int [50];
    int target = 42;


    for (int i =0; i<array.length;i++){

        array[i] = i;
    }
          binarySearch(array, target);
    
    /*In built binary function commented out below
     * didnt work the way it was meant to anyway
     */
        // int index = Arrays.binarySearch(array, target);

        // if(index == -101){
        //     System.out.println(target + " not found");
        // } else {
        //     System.out.println("Element found at " + index);
        // }


     }

    

    private static int binarySearch(int[] array, int target){
     
        int counter = 0;
        int beginningIndex = 0;
        int lastIndex = array.length - 1;
        
   
       while(beginningIndex <= lastIndex){
       
        /*as you can see when you run the code the middle value once found what occurs
         * is that the numbers on the side of the middle value not near the target are
         * effectively disregarded (Pretend they are deleted and cast aside)
         * then the other values are put in a line again and middle value is picked
         */
           int middleIndex = beginningIndex + (lastIndex - beginningIndex ) /2;
           int valueOfMiddleIndex = array[middleIndex];
   
           counter ++; //Using this counter to realise just how many times the binary search occurs
            String counting = (" Count: " + counter + " ");
           System.out.println("Middle value: " + valueOfMiddleIndex + counting);
           if(valueOfMiddleIndex < target) beginningIndex = middleIndex +1 ;
           else if (valueOfMiddleIndex > target) lastIndex = middleIndex -1;
           else return valueOfMiddleIndex; //If target is found

           
       }
       
       return -1;
           
       }}