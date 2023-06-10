package brocodeSearchAlgo;

public class interpolationSearch {

    public static void main(String[] args) {
        

        /** Interpolation searches
         * 
         * Interpolation search is an 'improved' variation of binary search
         * it is best used for 'Uniformly' distributed data (google that)
         * by guessing where a value might be based on calculated probe results
         * 
         * AVG TC - O(log(log (n)))
         * Worst case Scenario TC - O(n) [If Value list increases exponentially]
         */


         int[] array = {1,2,4,8,16,32,64,128,512};
         int target = 64;
         int index = interpolationSearchBro(array,target);


         /* to understand why we do index -1 
         refer to the interpolation search method aboves execution */
        if(index != -1){
            System.out.println("Element found at index: " + index);

        }
        else {
            System.out.println("Element not found");
        }







    }

    private static int interpolationSearchBro(int[] array, int target) {
        int lowerBound = 0;
        int higherBound = array.length -1;

        while(target >= array[lowerBound] && target <= array[higherBound] && lowerBound <= higherBound){
            
        int probe = lowerBound + (higherBound - lowerBound) *
                                     (target - array[lowerBound]) /
                                      (array[higherBound] - array [lowerBound]) ;

                                      
            System.out.println("Probing at Index: " + probe);

            if(target == array[probe]){
                return probe;
            }

            else if(array[probe]< target){
                lowerBound = probe + 1;
            }
            else {
                higherBound = probe -1;
            }
        }

        return -1;
    }
    
}
