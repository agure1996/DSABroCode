package brocodeDataStructures;

public class twoDArray {

    /** An array of arrays */
    public static void main(String[] args) {

        String[][] cars = {
                { "Camaro", "Corvette", "Sylvado" },
                { "Mustang", "Ranger", "Focus" },
                { "F150", "Volkswagon", "Nissan" },
                        };

        for (int i = 0; i < cars.length; i++) {

            /* so cursor moves down next window when car is shown (making a gap) */
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }
    }
}
