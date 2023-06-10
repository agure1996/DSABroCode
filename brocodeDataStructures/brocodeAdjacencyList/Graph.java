package brocodeDataStructures.brocodeAdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

   /**
    * for this graph
    * we are creating an arraylist of linkedlist to emulate an adjacency list
    */

   ArrayList<LinkedList<Node>> aList;

   /**^^ to understand where the Node is instantiated refer to the Node class */

   Graph() {
      aList = new ArrayList<>();
   }

   public void addNode(Node node) {
      LinkedList<Node> currentList = new LinkedList<>();
      currentList.add(node);
      aList.add(currentList);

   }

   public void addEdge(int src, int dest) {
      /*
       * to add an edge to our adjacency list we need to get a linkedList from the
       * arrayList
       * that is associated with the head node we want to add a edge to
       */
      LinkedList<Node> currentList = aList.get(src);

      /*
       * Taking the destination Node and adding it to the tail of our linkedList
       * this is because the destination node is a node where there is an edge linking
       * to it
       */
      // Linked destination to the tail of the linkedlist associated with the source
      // node
      Node destinationNode = aList.get(dest).get(0);
      currentList.add(destinationNode);

   }

   public boolean checkEdge(int src, int dest) {

      /* similar to add edge we use the first bit */

      LinkedList<Node> currentList = aList.get(src);
      /*
       * Taking the destination Node and adding it to the tail of our linkedList
       * this is because the destination node is a node where there is an edge linking
       * to it
       */

      // Linked destination to the tail of the linkedlist associated with the source
      // node
      Node destinationNode = aList.get(dest).get(0);

      for(Node node:currentList){
         if(node == destinationNode){
            return true;
         }
      }
      return false;
   }

   public void printGraph() {

      /** Loop through each LinkedList in our arrayList */
      for(LinkedList<Node> currentLinkedList : aList){

         /** loop through each node each selected LinkedList */
         for(Node node: currentLinkedList){
            System.out.print(node.data + " -> " );
         }

         System.out.println();
      }

   }

}
