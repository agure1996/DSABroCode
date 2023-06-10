package brocodeDataStructures;

import java.util.Hashtable;

public class hashSets {
    /**
     * Hashtable - a data structure that stores unique keys to values (Key value pair)
     * 
     * each K/V pair is known as an entry
     * consists of a fast insertion/look-up and deletion of key-value pairs
     * great for large data sets but not ideal for small simple data sets
     * 
     * 
     * hashing -  takes the key value and computes an integer ( formula based on key and data type)
     *              normally its : key.hascode() % capacity = index 
     *              
     * if values end up being hashed to same number, a bucket in the form of a linked list acts as storage for the values in that specific number key when collisions occur (when  hash function generates similar index for two seperate key values) 
     * 
     * TC -  best case O(1)      worst case O(n)
     * @param args
     */
    
    public static void main(String[] args) {
        
        Hashtable<Integer,String> studentTable = new Hashtable<>(0,10); 

        studentTable.put(100,"Abbas");
        studentTable.put(124,"Gure");
        studentTable.put(231,"Lerai");
        studentTable.put(342,"Ob");
        studentTable.put(765,"Bahman");
        studentTable.put(657,"Jerry");

        for(Integer key: studentTable.keySet()){
            System.out.println(key.hashCode() % (studentTable.size()) + "\t" + key + "\t" + studentTable.get(key));
        }
    }

    
}
