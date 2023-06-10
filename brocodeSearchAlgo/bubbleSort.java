package brocodeSearchAlgo;

public class bubbleSort {

    public static void main(String[] args) {
        
        /** Bubblesort Algorithm
         * 
         * Pairs of adjacenet elements values are compared and are then swapped if not in order
         * rinse and repeat
         * 
         * Rather inefficient process TC - o(n^2)
         * Small set data - not the best
         * large set of data - very bad
         */


         int []array = {3,1,4,5,2,6,8,9,7};

        /*Bubble sort the array above */
         bubbleSortBro(array);
         /* now to println saying we sorting it out */
            System.out.println("Sorting out these values via bubble sort: ");
            System.out.println("3 , 1 , 4 , 5 , 2 , 6 , 8 , 9 , 7");
            System.out.println("");
            System.out.println("Now printing sorted numbers");
         /* loop through the bubblesorted array and print it */
         for (int i:array) {
            System.out.print(i + " , ");
         }
       

    }

    private static void bubbleSortBro(int[] array) {
        for(int i=0; i<array.length -1;i++){

        //Loop through the array

            for(int j=0; j<array.length -1;j++){

                /*Loop through array again except this time we switch places of values
                 * when switching values we temporary place a value inside a temp int as a container
                 * then reassign the current one with the next value we were comparing then reassign the other value with the value we put in the temp
                */
                if(array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
}
