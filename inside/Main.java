package inside;

public class Main {
    public static void main(String[] args) {
        Outside out = new Outside();
        Outside.Inside in = out.new Inside();

        in.greeting();
        
    }
}
