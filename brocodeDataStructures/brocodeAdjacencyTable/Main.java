package brocodeDataStructures.brocodeAdjacencyTable;

public class Main {

    
    /**
     *  We will emulate an adjacent matrix using a graph 
     * 
     * Adjacency Matrix - an array of 1's and 0's to represent edges between nodes
     *                          # of rows = # of unique nodes
     *                          # of columns = # of unique nodes
     * 
     *                  Runtime complexity to check an edge = O(1)
     *                  Space complexity= O(number of vectors(vertices)^2)
     * @param args
     */

    public static void main(String[] args) {
        

        Graph graph = new Graph(5);


        /* Adding Nodes to our graph */
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        /** adding edges between Nodes */

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);

        /** invoking our custom print method */
        graph.print();
        System.out.println();
        graph.checkEdge(0, 1);

    }
    
}
