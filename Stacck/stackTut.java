package Stacck;

import java.util.Stack;

public class stackTut {
    
    /**Stack data structure
     * Effectively a data structure emulating a stack in real life (Vertical tower)
     * LIFO - Last In First Out
     * 
     * push: add item to the top
     * pop: remove topmost item
     */

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(123123);
        stack.push(123421);
        stack.push(9128923);
        stack.push(91823921);
        
       int popped = stack.pop();

       System.out.println(stack);
       System.out.println(popped);
    }
}
