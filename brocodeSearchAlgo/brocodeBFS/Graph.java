package brocodeSearchAlgo.brocodeBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    
      public void breathFirstSearch(int src) {

        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[matrix.length];
        
        /** passing the index of starting node */
        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0){
            src = queue.poll();
            System.out.println(nodes.get(src).data + " = Visited");


            for (int i=0;i<matrix[src].length;i++){
                //check to see if value is 1 and node we are trying to visit has not been visited

                if(matrix[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        


    }
}
