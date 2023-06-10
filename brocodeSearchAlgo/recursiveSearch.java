package brocodeSearchAlgo;

public class recursiveSearch {

    /**
     * Recursion 
     * 
     * Applying the result of a procedure (aka a loop) to itself.
     * A recursive method effectively calls itself resulting in a loop.
     * hence why its a substitute for iterator/iterations
     * 
     * divide a problem into sub-problems of the same type as the original (picture the russian doll)
     * 
     * commonly used with advanced sorting algorithms and navigating trees
     * 
     * 
     * Advantages?
     * 
     * easier to read and write and debug as well!!
     * 
     * Disadvantages?
     * Sometimes slower ( espeically if working with perpetually large workload)
     * hence why it uses more memory since more methods added we need to keep track of
     * 
     * Hence recursiive methods are used for more advanced sortng algorithms
     * 
     * @param args
     */
    public static void main(String[] args) {

        /** for comparison */
        
        
        /* lets make an iterative method for . . .  walking */
        //Iteration is repetition of a process
        System.out.println("Walk via Iterative Method");    
        walkIteration(5);
        System.out.println("_______________");


        /* lets make a recursive method for. . . . walking as well */
        //Recursion is a repetition of a procedure


        System.out.println("Walk via Recursive method");
        walkRecursion(5);
        /* Keep in mind the way recursion works when main is executed
         * 
         * is that main method gets put in a call stack
         * 
         * remember how stacks work?? LIFO?
         * 
         * so picture if walk method = 5?
         * 
         *  Stack => top    | walk x1 | 5
         *                  | walk x1 | 4
         *                  | walk x1 | 3
         *                  | walk x1 | 2
         *                  | walk x1 | 1
         *                  | Main    | 
         *                  |_________| code execution complete 
         *              (btw refer to the recursive method this is a visualisation of the method I wrote below)
         */



        /* Here is a better example of a recursion */

        System.out.println("");
        System.out.println("Recursive Method Using Exponent");
        System.out.println(power(2,8));




    }

    private static int power(int base, int exponent) {

        if(exponent < 1) return 1; //base case
        return base * power(base, exponent -1);
    }

    private static void walkIteration(int steps) {
        /* iterative method */
        for(int i=0; i<steps; i++){
            System.out.println("Step!");
        }
    }

     private static void walkRecursion(int steps) {
        /* recursive method */
        // Recursive methods require a base case so . . 
        if(steps < 1){ 
            return ; //base case
        }
            System.out.println("You took a step!!");
            walkRecursion(steps-1);
    }
    
}
