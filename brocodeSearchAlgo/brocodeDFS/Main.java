package brocodeSearchAlgo.brocodeDFS;

public class Main {

    /***
     * Depth First Search - A search algorithm best known for traversing tree and graph data structures
     * 
     * 
     * DFS is broken into 3 steps:
     * 
     *  1-Pick a Route
     *  2-Keep on going through nodes until you reach a deadend, or a previously visited node
     *              and when we do . . . 
     *  3-Backtrack to last Node that has unvisited adjacent neighbours
     *      Rinse and repeat!! Think of traversing a maze essentially
     *          
     * @param args
     */

     public static void main(String[] args) {


         Graph graph = new Graph(5);


        /* Adding Nodes to our graph */
        graph.addNode(new Node('A'));//element id #0
        graph.addNode(new Node('B'));//element id #1
        graph.addNode(new Node('C'));//element id #2
        graph.addNode(new Node('D'));//element id #3
        graph.addNode(new Node('E'));//element id #4

        /** adding edges between Nodes */

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);

        /** invoking our custom print method */
        graph.print();
        System.out.println("");
        /**invoking our dfs method to traverse the graph with the edges we added */
        graph.depthFirstSearch(2);
        
     }
    
}
