package brocodeSearchAlgo;

public class selectionSortAlgo {

    public static void main(String[] args) {
        

        /**Selection sort
         * 
         * Searches through an array while keeping track of the minimum value during each iteration
         * At the end of each iteration values are swapped
         * 
         * It is very bad with large datasets and ok with small datasets = TC - O(n^2)
         */

        int [] array = {3,1,4,5,2,6,8,9,7};

        selectionSort(array);
       
        for (int i: array){
            System.out.print(i + " , ");}
        }

    

    private static void selectionSort(int[] array) {  

        for(int i=0; i<array.length;i++){

            /*set the minimum as our i value */
            int min = i;

            /* while 'i' is the minimum */
            for(int j=i+1; j<array.length;j++){
                /* 
                 * if 'i' is greater than 'j'?
                 */
                if (array[min] > array[j]){
                    /* 
                    * then assign 'j' as the new min
                    */
                    min = j;

                }
            }
            /* create a temporary container to hold the 'i' value */
            int temp = array[i];
            /* assign i as the next min for the next iterator */
            array[i] = array[min];
            /* assign min value as the temp */
            array[min] = temp;

        }
    }
    
}
