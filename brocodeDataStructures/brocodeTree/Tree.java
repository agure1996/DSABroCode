package brocodeDataStructures.brocodeTree;

public class Tree {
    
    /**
     * Tree data structure -  trees are non-linear data structure
     * where nodes are organized in a hierarchy
     * 
     * generally used in -  file explorer, databases, DNS, HTML DOM  
     * 
     * top of the tree is called the root node (parent node)- doesnt have incoming edges only outgoing edges
     * bottom part of tree are leaf nodes - they do not have outgoing edges, only incoming edges
     * middle part of tree are branch nodes - since they have ingoing and outgoing edges
     * 
     * 
     * Binary Tree -  A tree in which each Node has no more than two children, hence why its binary
     * 
     * Binary Search tree - A tree data structure, where each node is greater than its left child
     *                                                 but its less than its right child
     * 
     * Benefit: its easy to locate a node when they are in this order
     * 
     * TC - Best Case O(log n)
     *      Worst Case O(n)
     * 
     *Space Complexity - O(n)
     * @param args
     */

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(new Node(5));
        tree.insertNode(new Node(2));
        tree.insertNode(new Node(9));
        tree.insertNode(new Node(1));
        tree.insertNode(new Node(7));
        tree.insertNode(new Node(3));
        tree.insertNode(new Node(6));
        tree.insertNode(new Node(4));
        tree.insertNode(new Node(8));

        tree.display();
        tree.remove(4);

        //testing out removing 4    
        System.out.println( " ");
        tree.display();
        // System.out.println(tree.search(2));

    }
    
}
