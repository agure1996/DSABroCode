package brocodeSearchAlgo.brocodeBFS;

public class Main {

    /***
     * Breath First Search - A search algorithm best known for traversing graph data structures level by level
     *                          to do this they utilise a queue
     *                          works best when destination is on average close to start
     *                          siblings in tree are visited before visiting children
     * 
     * 
     * 
     * Depth first search meanwhile - traverses a graph branch by branch
     *                                 to do this they utilise a stack
     *                                  works better with destinations that are further from the start
     *                                  children are visited before other siblings on the tree
     *                                   more popular for games and puzzles
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
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        /** invoking our custom print method */
        graph.print();
        System.out.println("");
        /**invoking our bfs method to traverse the graph with the edges we added */
        graph.breathFirstSearch(1);
        
     }
    
}
