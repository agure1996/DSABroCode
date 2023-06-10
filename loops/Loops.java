package loops;

import java.util.Scanner;


public class Loops {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int rows;
    int columns;

    String symbol = "$";

        System.out.println("Enter number of rows: ");
        rows=scanner.nextInt();

        System.out.println("Enter number of Columns: ");
        columns=scanner.nextInt();


        for(int i=0; i<rows;i++){
            System.out.println();
            for (int j = 0; j<columns;j++){
                System.out.print(symbol);
            }
        }
        scanner.close();
    }

    
}
