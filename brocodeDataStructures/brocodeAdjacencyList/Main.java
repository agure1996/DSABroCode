package brocodeDataStructures.brocodeAdjacencyList;

public class Main {
    

    /**
     * Adjacency list- an array/arraylist of linkedlists.
     *                  Each linkedlist has a unique node at the head
     *                  all adjacent neighbours to that node are added to that node's linkelist.
     *                  
     *                          v: Number of vector e: Number of edges
     *                  runtime complexity when checking an edge: O(v)
     *                  space complexity: O(v+e);
     * @param args
     */

    public static void main(String[] args) {
        

        Graph graph = new Graph();

        /** Use the addNode method to add a Node - refer to method in graph class */

        graph.addNode(new Node('A')); //Even though if it is not stated the data A is automatically assigned to node element no.0
        graph.addNode(new Node('B')); //node element no.1
        graph.addNode(new Node('C'));//node element no.2
        graph.addNode(new Node('D'));//node element no.3
        graph.addNode(new Node('E'));//node element no.4

        /**
         * Using the addEdge method to add an edge
            src - index of initial element im starting edge from
            dest - index of destination element im ending edge at
        */
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);


        /** Print the graph */
        graph.printGraph();

    }
}
