package brocodeSearchAlgo;

public class insertionSort {

    /**Insertion sort
     * after comparing elements to the left we shift elements to the right to make room to insert a value
     * it has less steps than bubble sort!!
     * 
     * best case scenario is O(n) compared to selection sort O(n^2)
     */
    public static void main(String[] args) {
        
        int [] array = {3,1,4,5,2,6,8,9,7};

        insertionSortBro(array);

        for (int i:array){
            System.out.print(i + " ");
        }


    }

    private static void insertionSortBro(int[] array) {

        for(int i = 1; i< array.length;i++){
            //Place i value into a temp
            int temp = array[i];
            //We create j to keep track of value we are comparing to left of what i is
            int j = i- 1;
            
            /* In this while loop we will keep comparing to value left of i */
            while (j >= 0 && array[j]> temp){
                /* if we wanna shift the element to the right we simply assign j to next value after j
            * which of course is the next element of element containing j which means element + 1 right?
                 * assign the next element as our current j 
                 * we then decrement and assign our next element to the temp so we can compare it to the rest of the values we are sifting through
                    */
                array[j+1] = array[j];
                j--;
                array[j+1] = temp;
            }


        }
    }
    
}
