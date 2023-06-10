package brocodeDataStructures;



public class arrList {
    
  
    public static void main(String[] args) {
        
        //Lets instantiate a dynamic array / or as we call it, an arraylist with our own custom functions,similar to normal ones 

        // couldnt instantiate and run it here at the same time sadly :(

       DynamicArray dynamicArray = new DynamicArray();
       
       dynamicArray.add("2");
       dynamicArray.add("3");
       dynamicArray.add("4");
       dynamicArray.insert(0, "22");
       dynamicArray.delete("2");
       dynamicArray.delete("22");
       dynamicArray.delete("4");

       System.out.println("Empty: " + dynamicArray.isEmpty());
       System.out.println("Size: " + dynamicArray.size);
       System.out.println("Capacity: " + dynamicArray.capacity);
       System.out.println(dynamicArray);
       System.out.println(dynamicArray.search("9"));
        

        /** ArrayList also known as dynamic array 
         * 
         *                  Advantages:
         * 
         * Random access of elements is very fast O(1)
         * memory location of array contents is continuous and thus fast access,
         *  no need to jump around like you do in LinkedLists
         * insertion and deletions at the end is fast
         * 
         *                  Disadvantages:
         * 
         * Wastes a lot of memory as times you have to overcompensate size of array even if you wont use it all
         * Shifting elements is time consuming O(n)
         *  Expanding and shrinking the array is time consuming too! O(n)
         * insertion and deletions at the end is fast
        */


    }
}
