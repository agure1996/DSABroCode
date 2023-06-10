package brocodeDataStructures.brocodeAdjacencyTable;

import java.util.ArrayList;


public class Graph {

    /** let me quickly instantiate the nodes that will be at the top of the console log above the adjacency rows */

    ArrayList <Node> nodes;

    /** instantiate the graph */

    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    
    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int src, int dest){

        matrix [src][dest] = 1;

    }
    
    public boolean checkEdge(int src, int dest){
        if(matrix[src][dest] == 1){
            System.out.println("There is an edge between the two Nodes");
            return true ;
        } else {

            System.out.println("There is no edge between the two Nodes");
             return false;
        }
    }

    /** looping through the graph */
    public void print(){
        //Spacing
        System.out.print("  ");
        /** quickly loop through node before presenting graph so we have nodes as headers */
        for(Node node:nodes){
            System.out.print(node.data + " ");
            
        }
        System.out.println();
       for (int i=0; i<matrix.length;i++){
        System.out.print(nodes.get(i).data + " ");

        for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println(" ");

        }

    }
}
