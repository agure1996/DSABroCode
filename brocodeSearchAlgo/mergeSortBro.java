package brocodeSearchAlgo;

public class mergeSortBro {
    

    /**
     * Merge Sort
     * 
     * Recursively divide an array into 2, sort them and then recombine the split elements back into one
     * TC - O(n log n))
     * Space complexity - O(n)
     * @param args
     */

    public static void main(String[] args) {
        
        int []array = {3,1,4,5,2,6,8,9,7};

        mergeSort(array);
        
        for(int i:array)
         System.out.print(i + " ");
        
    }

    private static void mergeSort(int[] array) {

        int length = array.length;

        if(length <= 1) return; //base case

        int middleArray = length/2;
        int[] leftArray = new int[middleArray];
        int[] rightArray = new int[length - middleArray];

        int i = 0; // for left array
        int j = 0; // for right array

        for(;i<length;i++){
            if(i< middleArray){
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){

        int leftSize = array.length/2;
        int rightSize = array.length-leftSize;

        int i = 0;
        int l = 0;
        int r = 0; //indices for left, right and other array

        //Check conditions for merging

        while (l < leftSize && r <rightSize){

            if( leftArray[l] < rightArray[r]){
            array[i] = leftArray[l];
            i++;
            l++;
            }

            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        /* if a stray element remains, normally happens during odd number splits */
        while (l < leftSize){
            array[i]=leftArray[l];
            i++;
            l++;
        }
        while (r< rightSize){
            array[i]=rightArray[r];
            i++;
            r++;
        }
    }
}
