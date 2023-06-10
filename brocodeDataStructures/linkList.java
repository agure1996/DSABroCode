package brocodeDataStructures;

import java.util.LinkedList;

public class linkList {

    public static void main(String[] args) {
        
        /***
         * Linked List has functionalities of a Stack and a Queue
         * so it can use push/offer
         * and use pop/poll to remove
         * 
         * add method can be used to insert value anywhere in linked list, this method is O(n) complexity though
         * Warning! Keep in mind which method you use to add to the linkedlist
       
         */
        LinkedList <String> linky = new LinkedList<>();

        linky.offer("A");
        linky.offer("B");
        linky.offer("C");
        linky.offer("D");
        linky.pollLast();

        linky.add(3, "E");
        linky.add(4, "F");
        linky.remove(3);

        System.out.println(linky);


        /*  * 
         * 
         * 
         * Linked-List stores a node in 2 parts (Address (or index) , data)
         * Nodes are non-consequetive memory locations
         * Elements in Linked list are linked using pointers
         * 
         *                          Singly Linked List
         *              Node                Node                Node
         *     [ address | data ] ->  [ address | data ] -> [ address | data ]
         * 
         *                          Doubly Linked List
         *           Node                                        Node                                 Node
         * [ prev address | data | Next Address ]  <->  [ prev address | data | Next Address ] <-> [ prev address | data | Next Address ]
         * 
         *                                    Advantages:
         * 
         *           *  it is a dynamic data structure (allocates required memory while running)
         *           * Insertion and deletion of nodes is easy and fast (TC of o(1))
         *           * little to no memory waste
         * 
         *                                  Disadvantages
                     * Due to the additional Pointers increased memory usage
                     * No random access of elements (e.g. from index[i])
                     * accessing and searching elements is more time consuming [O(n)] 
                     * since searching is started from head or tail end and traversed along, like following a breadcrumb trail
                     * 
                     * 
        *                                   Uses?
        *               Implementing Stacks/Queues
                        GPS navigation (railway)
                        Music Playlist
         *  */
    }
    
}
