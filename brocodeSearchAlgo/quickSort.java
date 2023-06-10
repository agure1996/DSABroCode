package brocodeSearchAlgo;

public class quickSort {

    public static void main(String[] args) {
        /** Quicksort algorithm - moves smaller elements to the left of pivot
         * and larger elements to the right of pivot
         * does a divide and conquer kind of sort by recurively diving array into 2 partitions
         * 
         * in terms of time complexity - best case: O (n log(n))
         *                               average cases: O(n log(n))
         *                               worst case: O(n^2) if already sorted
         * 
         * since its a recursion the space complexity is O(log(n))
         */
        

        int []array = {3,1,4,5,2,6,8,9,7};

        quickSortBro(array,0,array.length -1);

        for(int i:array)System.out.print(i + " ");
    }

    private static void quickSortBro(int[] array, int startingIndex, int endingIndex) {

        if(endingIndex <= startingIndex) return; // base case
        int pivot = partition(array, startingIndex, endingIndex);

        quickSortBro(array, startingIndex, pivot -1);
        quickSortBro(array, pivot +1 , endingIndex);
        
    }
    private static int partition(int[] array, int startingIndex, int endingIndex) {

        int pivot = array[endingIndex];
        int i = startingIndex-1;
        

        for (int j= startingIndex; j<=endingIndex -1;j++){
            if(array[j] <  pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        i++;
        int temp = array[i];
                array[i] = array[endingIndex];
                array[endingIndex] = temp;
        return i;
    }
    
}
