package brocodeDataStructures.brocodeTree;

public class BinarySearchTree {

    Node root;

    public void insertNode(Node node){

        /* will be using recursion, its easier to use recursion with a helper method */
        root = insertHelperMethod(root, node);
    }

    public Node insertHelperMethod(Node root, Node node){

        int data= node.data;

        if(root == null){
            root = node;
            return root;
        } else if(data < root.data){
            /** if data value is less than root value. we then recursively go left side of tree (remember what goes on left side of tree value wise) */
            root.left = insertHelperMethod(root.left, node);
        } else{
            root.right = insertHelperMethod(root.right, node);
        }
        return root;
    }

    public void display(){
        displayHelper(root);
    }

    private void displayHelper(Node root){
        
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
            
        }
    }

    public boolean search(int data){

       return searchHelper(root,data);
    }
    
    private boolean searchHelper(Node root, int data){

        if(root == null){
            return false;
        }
        else if(root.data == data){
            return true;
        } else if (root.data > data){
            return searchHelper(root.left, data);
        }
         else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data){

        if(search(data)){
          removeHelper(root,data);   
        }
        else {
            System.out.println(data + "Data could not be found");
        }
        
    }

    private Node removeHelper(Node root, int data){

        if(root == null){
            return root;
        } else if (data < root.data){
            root.left = removeHelper(root.left, data);
        } else if ( data > root.data){
            root.right = removeHelper(root.right, data);

        } else {
            //node found
            
            if( root.left == null && root.right == null){
                root = null;
            }
        

            else if (root.right != null){

            /** must find successor to replace this node */

            root.data = findSuccessor(root);
            root.right = removeHelper(root.right, root.data);
        }

        else {

            root.data = findPredecessor(root);
            root.left = removeHelper(root.left, root.data);
        }
    }
        return root;
        } 

        //remove helper will be relying on two methods:

         //find a successor   

        private int findSuccessor (Node root) {
            /*Find least value below the right child of this root node */

            root = root.right;
            // we go right ^
            //Then we look as far left as we can

            while(root.left != null){
                root = root.left;
            }
            
            return root.data;}

         // find a predecessor
        private int findPredecessor (Node root) {
           /*Find Greatest value below the left child of this root node */

            root = root.left;
            // we go left ^
            //Then we look as far right as we can

            while(root.right != null){
                root = root.right;
            }
            
            return root.data;}
}
