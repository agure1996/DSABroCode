package brocodeDataStructures;

public class arrays {
    

    public static void main(String[] args) {
        
        /** Arrays are used to store multiple values in a single variable
         * Perks of an array consist of it being fast and searching is easy since we have an index
         * however insertion and deletion is not efficient since to insert you must technically create a new array
         * that will contain the new information. since shifting cells left or right aint it in large array
         */

        String [] cars = { "Ford" , "Toyota" , "Suzuki" , "Hyundai" , "BMW"};

        for (int i=0; i< cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
