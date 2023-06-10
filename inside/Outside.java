package inside;

public class Outside {

    /*An inner class
     * Is a class inside another class, useful for when classes that should be limited in scope
     * usually private access modifier but not necessary
     * helps in grouping classes that belong together   
     * useful for listeners for specific precursor for anonymous inner classes
     */
    
    String x = "Hello ";

    public class Inside{

        String y = "World!";

        public void greeting(){
            System.out.println(x+y);
        }

    }

}
