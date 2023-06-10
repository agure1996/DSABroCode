package brocodeDataStructures;
/** The following was practice for me to understand how arraylists work
 * array lists also known as dynamic arrays (Refer to brocode dynamicarray)
 */
public class DynamicArray{
    int size;
    int capacity = 8;
    Object [] array;


    public DynamicArray(){
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if (size >= capacity){
            grow();
        }

        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){

        if(size >= capacity){
            grow();
        }

        for(int i=size; i> index; i--){
            array[i] = array[i-1];
        }

        array[index] = data;
        size++;
    }

    public void delete(Object data){

        for (int i=0;i<size;i++){
            /*If array at index [i] equals the argument 
            (the data you are trying to pass in to get deleted)*/          
            if(array[i] == data){
                /*Need to shift all the elements to the left
                 * to do this we will need a nested for loop
                 * 
                 * The following nested forloop will continue as long as j
                 * goes trhough the entire array minus the deletion of the value and the actual block the data is stored in
                 */
                for (int j=0; j<size -i -1; j++){

                    array[i + j] = array [i+j +1];

                }

                array[size-1] = null;
                size--;

             if (size <= (capacity/3)){
                shrink();
                
            } 
            break;
        } 
           
           
        }
    }

    public int search (Object data){

        for (int i=0; i<size;i++){
            if(array[i] ==data){
                return i;
            }
        }
        return -1;
    }

    private void grow (){
        int newCapacity = capacity * 2;

        Object[] newArray = new Object[newCapacity];
        
        for(int i =0; i<size;i++){
            newArray[i] = array[i];
            capacity = newCapacity;
            array = newArray;
        }
    }

    private void shrink(){
        /* this method is similar to grow except of capacity x 2 its /2 */
        int newCapacity = capacity / 2;

        Object[] newArray = new Object[newCapacity];
        
        for(int i =0; i<size;i++){
            newArray[i] = array[i];
            capacity = newCapacity;
            array = newArray;
        }
    }

    public boolean isEmpty(){

        return  size == 0;
    }

    public String toString(){
        
        String string = "";
        
        for(int i=0; i<capacity;i++){
            string += array[i] + ", ";
        } if (string != ""){
            string = "[" + string.substring(0, string.length() -2) + "]";
           
        } else{
            string = "[]";
        }
        return string;
    }

    }
