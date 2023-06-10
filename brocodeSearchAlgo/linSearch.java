package brocodeSearchAlgo;

public class linSearch {

    private static int linearSearch(int[] numbers, int value) {
        
        for (int i = 0; i<numbers.length;i++){
        if(numbers[i] == value){
            return i;
        }   
        }
        
        return -1;
    }

    public static void main(String[] args) { 

        /*linear search 
         * 
         * Iterate through collection one element at a time
         * 
         * TC - O(n)
         * 
         * Disadvantages: Slow for large data sets
         * 
         * Advantages: Fast for searches in small to medium data sets
         *              Does not need to be sorted
         *              Useful for data sets that do not have random access (e.g. LinkedLists)
         */


        int[] numbers = {1,2,3,4,5,6,7,8,9,4,23,234,454,235,234,123,5234,34};

        int index = linearSearch(numbers,454);

        if(index != -1){
            System.out.println("Element found at index : " + index);
        } 
        else {
            System.out.println("Element not found");
             }
    }
}
