package brocodeSearchAlgo.brocodeDFS;

import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
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
    
    public void depthFirstSearch(int src){

        /** Keep track of visited nodes */

        boolean [] visited = new  boolean[matrix.length];
        dfsHelper(src,visited);

    }


    private void dfsHelper(int src, boolean[] visited) {
             /** we are going to check if the current node is visited on */
             if(visited[src] == true){
                return ;
             }
             else {
                visited[src] = true;
                System.out.println(nodes.get(src).data + " = visited");
             }

             for(int i=0; i< matrix.length;i++){
                //src is the row we are working with, i is the column
                if(matrix[src][i] == 1){

                    /* we will */
                    dfsHelper(i, visited);
                }
             }

             //If we successfully search through an entire row
             return;


    }
}
